package AD.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "titor")
public class Titor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_titor;
    private String nome;
    private String apelido;

    @OneToMany(mappedBy = "fk_titor",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    private List<Alumno> alumnos;


    public List<Alumno> getPokemons() {
        return alumnos;
    }

    public void setPokemons(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }



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