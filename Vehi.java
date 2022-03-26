package com.company;

abstract class Vehiculo{
    abstract  void camion();
}

class Tipo extends Vehiculo{
    void camion(){
        System.out.println("Caractersiticas");
    }
}

public class Vehi{
    public static void main(String[] args){
        Tipo v = new Tipo();
        v.camion();
    }
}