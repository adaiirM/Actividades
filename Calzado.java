package com.company;

public class Calzado {
    //Atributos
    private String color, numero, genero, tipo;

    //Metodo constructor
    public Calzado(String color, String numero, String genero, String tipo){
        this.color = color;
        this. numero = numero;
        this.genero = genero;
        this.tipo = tipo;
    }
    //Metodo set; para ingresar datos
    public void setColor(String color) {this.color = color;}
    public void setAltura(String numero) {this.numero = numero;}
    public void setEspecie(String genero) {this.genero = genero;}
    public void setHojas(String tipo) {this.tipo = tipo;}
    //Metodo get; para mostrar datos
    public String getN_pisos() {return color;}
    public String getMaterial() {return numero;}
    public String getTecho() {return genero;}
    public String getnCuartos() {return tipo;}
}