package test.uol.resolutionapp.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import test.uol.resolutionapp.model.ResolutionResponse;
import test.uol.resolutionapp.persistence.entity.Resolution;
import test.uol.resolutionapp.service.Mapper;
import test.uol.resolutionapp.service.MapperList;

@Component
public class ResolutionResponseMapper implements Mapper<Resolution, ResolutionResponse>, MapperList<Resolution, ResolutionResponse> {

    @Override
    public ResolutionResponse map(Resolution input) {
        
        ResolutionResponse response = new ResolutionResponse();

        response.setId(input.getId());
        response.setNome(input.getNome());
        response.setData(input.getData());
        
        return response;
    }

    @Override
    public List<ResolutionResponse> mapList(List<Resolution> input) {
        return input.stream().map(x -> map(x)).collect(Collectors.toList());

    }
    
}

