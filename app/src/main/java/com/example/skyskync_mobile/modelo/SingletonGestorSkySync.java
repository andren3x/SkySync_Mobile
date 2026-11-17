package com.example.skyskync_mobile.modelo;

import java.util.ArrayList;

public class SingletonGestorSkySync {

    // Lista de voos
    private ArrayList<Voo> voos;

    // 1.
    // static: não deixa ser instânciado  e é uma instância partilhada por toda a app
    private static SingletonGestorSkySync instance;


    // Garante uma unica instância (synchronized é thread-safe)
    public static synchronized SingletonGestorSkySync getInstance(){
        if(instance == null)
            instance = new SingletonGestorSkySync();
        return instance;
    }

            //2.CONTRUTORES

    // Construtor, ao ser private impede que se faça new SingletonGestorLivros();
    private SingletonGestorSkySync(){
        voos = new ArrayList<>();
        gerarVoos();
    }

            // 3.COPIAS

    //Devolve uma cópia, assim fora da classe não altera diretamente a lista;
    public ArrayList<Voo> getVoos() {
        return new ArrayList<>(voos);
    }

    public Voo getVoos(int id) {
        for (Voo voo : voos)
            if (voo.getId() == id)
                return voo;
        return null;
    }

    // Dados de exemplo (mais tarde vêm da API)
    private void gerarVoos() {
        voos.add(new Voo(1, "TP1940", 1, 5, 4,
                "2026-10-29 08:00:00", "2026-10-29 09:00:00",
                "2026-10-29 08:00:00", "2026-10-29 09:00:00",
                49.99, "agendado", "A12", "LIS", "OPO"));
        voos.add(new Voo(2, "TP1700", 1, 4, 2,
                "2026-10-29 10:00:00", "2026-10-29 13:30:00",
                "2026-10-29 10:00:00", "2026-10-29 13:30:00",
                89.99, "agendado", null, "OPO", "FCO"));
    }


}
