package com.company;

public class Bicicleta  {
    //Atributos
    private String tam_llanta, material;

    //Metodo constructor
    public Bicicleta(String tam_llanta, String material){
        this.tam_llanta = tam_llanta;
        this.material = material;
    }
    //Metodo set; para ingresar datos
    public void setTam_llanta(String tam_llanta) {this.tam_llanta = tam_llanta;}
    public void setMaterial(String material) {this.material = material;}
    //Metodo get; para mostrar datos
    public String getMaterial() {return material;}
    public String getTam_llanta() {return tam_llanta;}
}