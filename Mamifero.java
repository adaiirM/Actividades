package com.company;

public class Mamifero  {
    //Atributos
    private String tipo, nombre, peso, especie;

    //Metodo constructor
    public Mamifero(String tipo, String nombre, String peso, String especie){
        this.tipo = tipo;
        this.nombre = nombre;
        this.peso = peso;
        this.especie = especie;
    }
    //Metodo set; para ingresar datos
    public void setPeso(String peso) {this.peso = peso;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEspecie(String especie) {this.especie = especie;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    //Metodo get; para mostrar datos
    public String getEspecie() {return especie;}
    public String getPeso() {return peso;}
    public String getNombre() {return nombre;}
    public String getTipo() {return tipo;}
}