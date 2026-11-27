package com.example.skyskync_mobile.modelo;

public class Passageiro {

    private int id, user_id;
    private String nome, numero_documento, nacionalidade, contacto, tipo_documento, email;


    public Passageiro(int id, int user_id, String nome, String numero_documento, String nacionalidade, String contacto, String tipo_documento, String email) {

        this.id = id;
        this.user_id = user_id;
        this.nome = nome;
        this.numero_documento = numero_documento;
        this.nacionalidade = nacionalidade;
        this.contacto = contacto;
        this.tipo_documento = tipo_documento;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getContacto() {
        return contacto;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
