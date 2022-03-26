package com.company;

public class Estudiante  {
    //Atributos
    private String nombre, semestre, carrera;
    private int edad;

    //Metodo constructor
    public Estudiante(String nombre, String semestre, String carrera, int edad){
        this.nombre = nombre;
        this.semestre = semestre;
        this.carrera = carrera;
        this.edad = edad;
    }
    //Metodo set; para ingresar datos
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCarrera(String carrera) {this.carrera = carrera;}
    public void setSemestre(String semestre) {this.semestre = semestre;}
    public void setEdad(int edad) {this.edad = edad;}
    //Metodo get; para mostrar datos
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public String getCarrera() {return carrera;}
    public String getSemestre() {return semestre;}
}