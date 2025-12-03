package AD.model;

import jakarta.persistence.*;
@Entity
@Table(name = "alumno")
public class Alumno {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_alumno;
        private String nome;
        private String apelido;


    public Alumno() {
    }

    public Alumno(Long id_alumno, String nome, String apelido) {
        this.id_alumno = id_alumno;
        this.nome = nome;
        this.apelido = apelido;
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


}

