package AD.model;

import jakarta.persistence.*;
@Entity
@Table(name = "alumno")
public class Alumno {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id_alumno;
        private String nome;
        private String apelido;
        private Titor id_titor;

    public Alumno() {
    }

    public Alumno(Long id_alumno, String nome, String apelido, Titor id_titor) {
        this.id_alumno = id_alumno;
        this.nome = nome;
        this.apelido = apelido;
        this.id_titor = id_titor;
    }

    public Long getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Long id_alumno) {
        this.id_alumno = id_alumno;
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

    public Titor getId_titor() {
        return id_titor;
    }

    public void setId_titor(Titor id_titor) {
        this.id_titor = id_titor;
    }
}

