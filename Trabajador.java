package com.company;

public class Trabajador  {
    //Atributos
    private String nombre, salario, direccion;

    //Metodo constructor
    public Trabajador(String nombre, String salario, String direccion){
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    //Metodo set; para ingresar datos
    public void setSalario(String salario) {this.salario = salario;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    //Metodo get; para mostrar datos
    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    public String getSalario() {return salario;}

}