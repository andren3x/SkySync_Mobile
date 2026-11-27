package com.example.skyskync_mobile.modelo;

public class Voo {
    private int id, aviao_id, aeroporto_origem_id, aeroporto_destino_id;
    private String numero, hora_partida, hora_chegada, hora_partida_prevista, hora_chegada_prevista;
    private String estado, porta_embarque;
    private double preco_base;
    private String origem, destino;   // códigos IATA (mais tarde vêm da API)


    public Voo(int id, int aviao_id, int aeroporto_origem_id, int aeroporto_destino_id, String numero, String hora_partida, String hora_chegada, String hora_partida_prevista, String hora_chegada_prevista, String estado, String porta_embarque, double preco_base, String origem, String destino) {
        this.id = id;
        this.aviao_id = aviao_id;
        this.aeroporto_origem_id = aeroporto_origem_id;
        this.aeroporto_destino_id = aeroporto_destino_id;
        this.numero = numero;
        this.hora_partida = hora_partida;
        this.hora_chegada = hora_chegada;
        this.hora_partida_prevista = hora_partida_prevista;
        this.hora_chegada_prevista = hora_chegada_prevista;
        this.estado = estado;
        this.porta_embarque = porta_embarque;
        this.preco_base = preco_base;
        this.origem = origem;
        this.destino = destino;
    }


    public int getId() {
        return id;
    }

    public int getAviao_id() {
        return aviao_id;
    }

    public int getAeroporto_origem_id() {
        return aeroporto_origem_id;
    }

    public int getAeroporto_destino_id() {
        return aeroporto_destino_id;
    }

    public String getNumero() {
        return numero;
    }

    public String getHora_partida() {
        return hora_partida;
    }

    public String getHora_chegada() {
        return hora_chegada;
    }

    public String getHora_partida_prevista() {
        return hora_partida_prevista;
    }

    public String getHora_chegada_prevista() {
        return hora_chegada_prevista;
    }

    public String getEstado() {
        return estado;
    }

    public String getPorta_embarque() {
        return porta_embarque;
    }

    public double getPreco_base() {
        return preco_base;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}