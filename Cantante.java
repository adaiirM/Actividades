package com.company;

public class Cantante  {
    //Atributos
    private String nombre, edad, numeroAlbums;

    //Metodo constructor
    public Cantante(String nombre, String edad, String numeroAlbums){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroAlbums = numeroAlbums;
    }
    //Metodo set; para ingresar datos
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(String edad) {this.edad = edad;}
    public void setNumeroAlbums(String numeroAlbums) {this.numeroAlbums = numeroAlbums;}
    //Metodo get; para mostrar datos
    public String getNombre() {return nombre;}
    public String getEdad() {return edad;}
    public String getNumeroAlbums() {return numeroAlbums;}
}