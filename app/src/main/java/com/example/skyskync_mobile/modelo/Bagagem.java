package com.example.skyskync_mobile.modelo;

public class Bagagem {

    private int id, bilhete_id, tipo_bagagem_id;

    private double peso, preco;

    //Provavelmente não vai ser usado o bilhete_id
    //Set preco -> vai ser calculado pela API

    public Bagagem(int id, int bilhete_id, int tipo_bagagem_id, double peso, double preco) {
        this.id = id;
        this.bilhete_id = bilhete_id;
        this.tipo_bagagem_id = tipo_bagagem_id;
        this.peso = peso;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public int getBilhete_id() {
        return bilhete_id;
    }

    public int getTipo_bagagem_id() {
        return tipo_bagagem_id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
