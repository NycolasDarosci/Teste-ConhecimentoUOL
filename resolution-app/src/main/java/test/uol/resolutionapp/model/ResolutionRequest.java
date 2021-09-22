package test.uol.resolutionapp.model;

import java.time.LocalDate;
import java.util.Date;

public class ResolutionRequest {
    
    private String nome;

    private String data;

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
