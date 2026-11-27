package com.example.skyskync_mobile.modelo;

public class Bilhete {

    private int id, passageiro_id, voo_id;
    private String numero, estado, data_compra, data_check_in;
    private boolean check_in;
    private double preco_total;

    public Bilhete(int id, int passageiro_id, int voo_id, String numero, String estado, String data_compra, String data_check_in, boolean check_in, double preco_total)
    {
        this.id = id;
        this.passageiro_id = passageiro_id;
        this.voo_id = voo_id;
        this.numero = numero;
        this.estado = estado;
        this.data_compra = data_compra;
        this.data_check_in = data_check_in;
        this.check_in = check_in;
        this.preco_total = preco_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassageiro_id() {
        return passageiro_id;
    }

    public void setPassageiro_id(int passageiro_id) {
        this.passageiro_id = passageiro_id;
    }

    public int getVoo_id() {
        return voo_id;
    }

    public void setVoo_id(int voo_id) {
        this.voo_id = voo_id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public String getData_check_in() {
        return data_check_in;
    }

    public void setData_check_in(String data_check_in) {
        this.data_check_in = data_check_in;
    }

    public boolean isCheck_in() {
        return check_in;
    }

    public void setCheck_in(boolean check_in) {
        this.check_in = check_in;
    }

    public double getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(double preco_total) {
        this.preco_total = preco_total;
    }
}
