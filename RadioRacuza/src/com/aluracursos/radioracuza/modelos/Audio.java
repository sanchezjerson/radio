package com.aluracursos.radioracuza.modelos;

public class Audio {
    private String titulo;
    private int totalReproduciones;
    private int totalDeMeGusta;
    private int clasificacion;

    public void meGusta(){
        this.totalDeMeGusta ++;
    }
    public void reproduce(){
        this.totalReproduciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproduciones() {
        return totalReproduciones;
    }

    public void setTotalReproduciones(int totalReproduciones) {
        this.totalReproduciones = totalReproduciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
