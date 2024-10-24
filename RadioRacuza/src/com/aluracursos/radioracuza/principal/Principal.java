package com.aluracursos.radioracuza.principal;

import com.aluracursos.radioracuza.modelos.Canciones;
import com.aluracursos.radioracuza.modelos.MisFavoritos;
import com.aluracursos.radioracuza.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Canciones cancion = new Canciones();
        cancion.setTitulo("Forever Alone");
        cancion.setCantante("Farruko");

        Podcast podcast = new Podcast();
        podcast.setPresentador("eminen");
        podcast.setTitulo("nwa");
        // canciones
        for (int i = 0; i < 580; i++) {
            cancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            cancion.reproduce();}
            //podcast

        for (int i = 0; i < 100; i++) {
                podcast.meGusta();
        }
        for (int i= 0; i < 5000; i++) {
                podcast.reproduce();

        }
        System.out.println(" reproduce " + cancion.getTotalReproduciones());
        System.out.println("total de me gustas " + cancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(cancion);

        }


    }
