package test.uol.resolutionapp.service;

/* 
    interface para mapear duas classes genéricas
    no caso mapeio as requisições
*/
public interface Mapper<A, B> {
    
    B map(A input);

}
