package AD.model;

import jakarta.persistence.*;

@Entity
@Table(name = "titor")
public class Titor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_titor;
    private String nome;
    private String apelido;


    public Titor() {
    }

    public Titor(Long id_titor, String nome, String apelido) {
        this.id_titor = id_titor;
        this.nome = nome;
        this.apelido = apelido;
    }

    public Long getId_titor() {
        return id_titor;
    }

    public void setId_titor(Long id_titor) {
        this.id_titor = id_titor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}