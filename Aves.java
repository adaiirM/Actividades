package com.company;

public class Aves  {
    //Atributos
    private String tipo, color, peso;

    //Metodo constructor
    public Aves(String tipo, String color, String peso){
        this.tipo = tipo;
        this.color = color;
        this.peso = peso;
    }
    //Metodo set; para ingresar datos
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setColor(String color) {this.color = color;}
    public void setPeso(String peso) {this.peso = peso;}
    //Metodo get; para mostrar datos
    public String getTipo() {return tipo;}
    public String getColor() {return color;}
    public String getPeso() {return peso;}
}