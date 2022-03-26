package com.company;

public class Perro  {
    //Atributos
    private String raza, color, nombre, peso;

    //Metodo constructor
    public Perro(String raza, String color, String nombre, String peso){
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
        this.peso = peso;
    }
    //Metodo set; para ingresar datos
    public void setRaza(String raza) {this.raza = raza;}
    public void setColor(String color) {this.color = color;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPeso(String peso) {this.peso = peso;}
    //Metodo get; para mostrar datos
    public String getRaza() {return raza;}
    public String getColor() {return color;}
    public String getNombre() {return nombre;}
    public String getPeso() {return peso;}
}