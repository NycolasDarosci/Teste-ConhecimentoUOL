package test.uol.resolutionapp.model;

import java.time.LocalDate;
import java.util.Date;

public class ResolutionResponse {
    
    private Long Id;

    private String nome;

    private String data;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setData(String data) {
        this.data = data;
    }
}
