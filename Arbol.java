package com.company;

public class Arbol {
    //Atributos
    private String nombre, altura, especie, hojas;

    //Metodo constructor
    public Arbol(String nombre, String altura, String especie, String hojas){
        this.nombre = nombre;
        this. altura = altura;
        this.especie = especie;
        this.hojas = hojas;
    }
    //Metodo set; para ingresar datos
    public void setNombre(String peso) {this.nombre = peso;}
    public void setAltura(String color) {this.altura = color;}
    public void setEspecie(String especie) {this.especie = especie;}
    public void setHojas(String hojas) {this.hojas = hojas;}
    //Metodo get; para mostrar datos
    public String getNombre() {return nombre;}
    public String getAltura() {return altura;}
    public String getEspecie() {return especie;}
    public String getHojas() {return hojas;}
}
