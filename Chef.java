package com.company;

public class Chef  {
    //Atributos
    private String nombre, especialdiad, salario;

    //Metodo constructor
    public Chef(String nombre, String especialdiad, String salario){
        this.nombre = nombre;
        this.especialdiad = especialdiad;
        this.salario = salario;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEspecialdiad(String especialdiad) {this.especialdiad = especialdiad;}
    public void setSalario(String salario) {this.salario = salario;}

    public String getNombre() {return nombre;}
    public String getEspecialdiad() {return especialdiad;}
    public String getSalario() {return salario;}
}