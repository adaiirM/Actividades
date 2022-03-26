package com.company;

public class Coche  {
    //Atributos
    private String marca, modelo, color, matricula, precio;

    //Metodo constructor
    public Coche(String marca, String color, String modelo, String matricula, String precio){
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precio = precio;
    }
    //Metodo set; para ingresar datos
    public void setColor(String color) {this.color = color;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setPrecio(String precio) {this.precio = precio;}
    //Metodo get; para mostrar datos
    public String getColor() {return color;}
    public String getMarca() {return marca;}
    public String getMatricula() {return matricula;}
    public String getModelo() {return modelo;}
    public String getPrecio() {return precio;}
}