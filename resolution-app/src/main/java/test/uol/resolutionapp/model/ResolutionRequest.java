package test.uol.resolutionapp.model;

import java.time.LocalDate;

public class ResolutionRequest {
    
    private String nome;

    private LocalDate data;

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
