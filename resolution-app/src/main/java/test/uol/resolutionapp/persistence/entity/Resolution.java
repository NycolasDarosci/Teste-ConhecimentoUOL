package test.uol.resolutionapp.persistence.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resolution")
public class Resolution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private LocalDate data;

    public Resolution() {
        
    }

    public Resolution(Long id, String nome, LocalDate data){
        this.Id = id;
        this.nome = nome;
        this.data = data;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }
}
