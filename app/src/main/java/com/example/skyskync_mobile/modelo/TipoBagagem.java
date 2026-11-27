package com.example.skyskync_mobile.modelo;

public class TipoBagagem {

    private int id;
    private String nome;
    private double peso_maximo, preco;

    public TipoBagagem(int id, String nome, double peso_maximo, double preco) {
        this.id = id;
        this.nome = nome;
        this.peso_maximo = peso_maximo;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso_maximo() {
        return peso_maximo;
    }

    public double getPreco() {
        return preco;
    }
}
