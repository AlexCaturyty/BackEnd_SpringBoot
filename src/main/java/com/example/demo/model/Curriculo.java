package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "curriculos")
public class Curriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomecompleto;
    private String endereco;
    private String telefone;
    private String email;
    private String experienciaprofissional;

    public Curriculo(long id, String nomecompleto, String endereco, String telefone, String email, String experienciaprofissional, String educacao, String habilidades) {
        this.id = id;
        this.nomecompleto = nomecompleto;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.experienciaprofissional = experienciaprofissional;
        this.educacao = educacao;
        this.habilidades = habilidades;
    }

    public Curriculo(){

    }

    private String educacao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperienciaprofissional() {
        return experienciaprofissional;
    }

    public void setExperienciaprofissional(String experienciaprofissional) {
        this.experienciaprofissional = experienciaprofissional;
    }

    public String getEducacao() {
        return educacao;
    }

    public void setEducacao(String educacao) {
        this.educacao = educacao;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    private String habilidades;

}
