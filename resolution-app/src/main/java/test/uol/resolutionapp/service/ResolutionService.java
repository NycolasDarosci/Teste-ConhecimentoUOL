package test.uol.resolutionapp.service;

import java.util.List;

import test.uol.resolutionapp.model.ResolutionRequest;
import test.uol.resolutionapp.model.ResolutionResponse;

public interface ResolutionService {
    
    List<ResolutionResponse> listar();

    ResolutionResponse listarPorId(Long id);

    ResolutionResponse criar(ResolutionRequest request);

    ResolutionResponse atualizar(Long id, ResolutionRequest request);

    void deletar(Long id);

}
