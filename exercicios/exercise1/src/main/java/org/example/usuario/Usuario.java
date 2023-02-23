package org.example.usuario;

public class Usuario {
    private String nome;
    private String cpf;
    private String celular;

    public Usuario(String nome, String cpf, String celular){
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getCelular(){
        return this.celular;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }
}
