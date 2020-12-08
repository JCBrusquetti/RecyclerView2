package com.saludo.recyclerview2;

public class Mascota {

    private  int hueso;
    private int foto;
    private String nombre;
    private String numFav;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumFav() {
        return numFav;
    }

    public void setNumFav(String numFav) {
        this.numFav = numFav;
    }

    public Mascota(int hueso,int foto, String nombre,String numFav) {
        this.hueso = hueso;
        this.foto = foto;
        this.nombre = nombre;
        this.numFav = numFav;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getHueso() {
        return hueso;
    }

    public void setHueso(int hueso) {
        this.hueso = hueso;
    }
}
