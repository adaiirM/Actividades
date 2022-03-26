package com.company;

abstract class FigurasG{
    abstract  void area();
}

class Cuadrado extends FigurasG{
    void area(){
        System.out.println("Area del cuadrado");
    }
}

public class FigurasGeometricas{
    public static void main(String[] args){
        Cuadrado c = new Cuadrado();
        c.area();
    }
}