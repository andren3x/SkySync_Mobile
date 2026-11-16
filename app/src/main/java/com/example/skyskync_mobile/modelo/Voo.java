package com.example.skyskync_mobile.modelo;

public class Voo {
    private int id, aviaoId, aeroportoOrigemId, aeroportoDestinoId;
    private String numero, horaPartida, horaChegada, horaPartidaPrevista, horaChegadaPrevista;
    private String estado, portaEmbarque;
    private double precoBase;
    private String origem, destino;   // códigos IATA (mais tarde vêm da API)

    public Voo(int id, String numero, int aviaoId, int aeroportoOrigemId, int aeroportoDestinoId,
               String horaPartida, String horaChegada, String horaPartidaPrevista, String horaChegadaPrevista,
               double precoBase, String estado, String portaEmbarque, String origem, String destino) {
        this.id = id;
        this.numero = numero;
        this.aviaoId = aviaoId;
        this.aeroportoOrigemId = aeroportoOrigemId;
        this.aeroportoDestinoId = aeroportoDestinoId;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.horaPartidaPrevista = horaPartidaPrevista;
        this.horaChegadaPrevista = horaChegadaPrevista;
        this.precoBase = precoBase;
        this.estado = estado;
        this.portaEmbarque = portaEmbarque;
        this.origem = origem;
        this.destino = destino;
    }

    public int getId() { return id; }
    public String getNumero() { return numero; }
    public int getAviaoId() { return aviaoId; }
    public int getAeroportoOrigemId() { return aeroportoOrigemId; }
    public int getAeroportoDestinoId() { return aeroportoDestinoId; }
    public String getHoraPartida() { return horaPartida; }
    public String getHoraChegada() { return horaChegada; }
    public String getHoraPartidaPrevista() { return horaPartidaPrevista; }
    public String getHoraChegadaPrevista() { return horaChegadaPrevista; }
    public double getPrecoBase() { return precoBase; }
    public String getEstado() { return estado; }
    public String getPortaEmbarque() { return portaEmbarque; }
    public String getOrigem() { return origem; }
    public String getDestino() { return destino; }
}