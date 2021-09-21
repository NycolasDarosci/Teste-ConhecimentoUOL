package test.uol.resolutionapp.service.mapper;

import org.springframework.stereotype.Component;

import test.uol.resolutionapp.model.ResolutionRequest;
import test.uol.resolutionapp.persistence.entity.Resolution;
import test.uol.resolutionapp.service.Mapper;

@Component
public class ResolutionRequestMapper implements Mapper<ResolutionRequest, Resolution>{

    @Override
    public Resolution map(ResolutionRequest input) {
        Resolution r = new Resolution();

        r.setNome(input.getNome());
        r.setData(input.getData());
        
        return r;
    }

}

