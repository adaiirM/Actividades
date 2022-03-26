package com.company;

public class Casa {
    //Atributos
    private String n_pisos, material, techo, nCuartos;

    //Metodo constructor
    public Casa(String n_pisos, String material, String techo, String nCuartos){
        this.n_pisos = n_pisos;
        this. material = material;
        this.techo = techo;
        this.nCuartos = nCuartos;
    }

    public void setN_pisos(String n_pisos) {this.n_pisos = n_pisos;}
    public void setMaterial(String material) {this.material = material;}
    public void setTecho(String techo) {this.techo = techo;}
    public void setnCuartos(String nCuartos) {this.nCuartos = nCuartos;}

    public String getN_pisos() {return n_pisos;}
    public String getMaterial() {return material;}
    public String getTecho() {return techo;}
    public String getnCuartos() {return nCuartos;}
}