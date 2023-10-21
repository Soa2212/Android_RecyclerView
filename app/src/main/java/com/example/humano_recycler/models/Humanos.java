package com.example.humano_recycler.models;

public class Humanos extends Animal{

    private String nombre;
    private String nacionalidad;
    private String estilo;

    public Humanos(String nombre, String nacionalidad, String estilo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.estilo = estilo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
