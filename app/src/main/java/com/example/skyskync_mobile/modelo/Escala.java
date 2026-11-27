package com.example.skyskync_mobile.modelo;

public class Escala {

    private int id, voo_id, aeroporto_id, ordem;

    private String hora_chegada, hora_partida;


    public Escala(int id, String hora_chegada, String hora_partida, int ordem, int aeroporto_id, int voo_id) {
        this.id = id;
        this.hora_chegada = hora_chegada;
        this.hora_partida = hora_partida;
        this.ordem = ordem;
        this.aeroporto_id = aeroporto_id;
        this.voo_id = voo_id;
    }


    public int getId() {
        return id;
    }



    public int getVoo_id() {
        return voo_id;
    }

    
    public int getAeroporto_id() {
        return aeroporto_id;
    }


    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String getHora_chegada() {
        return hora_chegada;
    }

    public void setHora_chegada(String hora_chegada) {
        this.hora_chegada = hora_chegada;
    }

    public String getHora_partida() {
        return hora_partida;
    }

    public void setHora_partida(String hora_partida) {
        this.hora_partida = hora_partida;
    }
}
