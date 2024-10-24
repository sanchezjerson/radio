package com.aluracursos.radioracuza.modelos;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if(getTotalReproduciones() >= 200){
            return 7;
        }else{
            return 3;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
