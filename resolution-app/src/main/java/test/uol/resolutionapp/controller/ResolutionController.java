package test.uol.resolutionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.uol.resolutionapp.model.ResolutionRequest;
import test.uol.resolutionapp.model.ResolutionResponse;
import test.uol.resolutionapp.service.implementation.ResolutionServiceImpl;

@RestController
@RequestMapping("/im-day")
@CrossOrigin(origins = "http://localhost:4200")
public class ResolutionController {
    
    @Autowired
    private ResolutionServiceImpl service;

    @GetMapping
    public ResponseEntity<List<ResolutionResponse>> listar(){
        
        return ResponseEntity.ok(service.listar());        
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable("id") Long id){
        try {
            return ResponseEntity.ok(service.listarPorId(id));

        } catch (Exception e) {
            return noResolutionFound(id);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> criar(@RequestBody ResolutionRequest request){
        try {
            return 
            ResponseEntity
            .status(HttpStatus.CREATED)
            .body(service.criar(request));

        } catch (Exception e) {
            return errorResponse();
        }    
    }

    @PutMapping("/search/{id}")
    public ResponseEntity<?> atualizar(@PathVariable("id") Long id, @RequestBody ResolutionRequest request){
        try {
            return ResponseEntity
            .status(HttpStatus.ACCEPTED)
            .body(service.atualizar(id, request));

        } catch (Exception e) {
            return errorResponse();
        } 
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id){
        try {
            service.deletar(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return noResolutionFound(id);
        }
        
    }

    private ResponseEntity<String> errorResponse(){
        return new ResponseEntity<>("Algo deu erro !", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<String> noResolutionFound(Long id){
        return new ResponseEntity<>("Nenhuma resolução foi encontrada com id: " + id, HttpStatus.NOT_FOUND);
    }   
}
