package test.uol.resolutionapp.model;

import java.time.LocalDate;

public class ResolutionResponse {
    
    private Long Id;

    private String nome;

    private LocalDate data;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
}
