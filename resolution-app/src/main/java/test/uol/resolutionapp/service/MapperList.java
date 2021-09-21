package test.uol.resolutionapp.service;

import java.util.List;

public interface MapperList<A, B> {
    
    List<B> mapList(List<A> input);
}
