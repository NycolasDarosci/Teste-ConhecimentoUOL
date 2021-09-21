package test.uol.resolutionapp.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.uol.resolutionapp.model.ResolutionRequest;
import test.uol.resolutionapp.model.ResolutionResponse;
import test.uol.resolutionapp.persistence.entity.Resolution;
import test.uol.resolutionapp.persistence.repository.ResolutionRepository;
import test.uol.resolutionapp.service.ResolutionService;
import test.uol.resolutionapp.service.mapper.ResolutionRequestMapper;
import test.uol.resolutionapp.service.mapper.ResolutionResponseMapper;

@Service
public class ResolutionServiceImpl implements ResolutionService {

    @Autowired
    private ResolutionRepository repository;

    @Autowired
    private ResolutionResponseMapper res;

    @Autowired
    private ResolutionRequestMapper req;

    @Override
    public List<ResolutionResponse> listar() {
    
        List<Resolution> lista = repository.findAll();

        return res.mapList(lista);
    
    }

    @Override
    public ResolutionResponse listarPorId(Long id) {
        Resolution identify = repository.findById(id).orElseThrow();

        return res.map(identify);
    }

    @Override
    public ResolutionResponse criar(ResolutionRequest request) {
        
        Resolution db = repository.saveAndFlush(req.map(request));
        
        return res.map(db);
    }

    @Override
    public ResolutionResponse atualizar(Long id, ResolutionRequest request) {
        
        repository.findById(id).orElseThrow();

        Resolution resolution = new Resolution(id, request.getNome(), request.getData());

        repository.saveAndFlush(resolution);
        
        return res.map(resolution);
    }

    @Override
    public void deletar(Long id) {
        Optional<Resolution> r = repository.findById(id);
        if(r.isPresent()){
            repository.deleteById(id);
        }
    }
     
}
