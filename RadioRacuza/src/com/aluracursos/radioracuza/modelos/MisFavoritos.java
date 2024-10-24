package com.aluracursos.radioracuza.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if(audio.getClasificacion() >=8){
            System.out.println("Es el mejor evaluado ");

        }else{
            System.out.println("esta en el ranking");
        }
    }
}
