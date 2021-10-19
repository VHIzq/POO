package com.company;

public class Perro {

    String nombre;
    String raza;
    int edad;
    String tamanio;

    public Perro(){
    }

    public  Perro (String nombre){
        this.nombre = nombre;
    }
    public  Perro(String nombre, String raza, int edad, String tamanio){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    //metodos,

    public  void caracteristicas(){
        System.out.println("Hey!, me llamo  " +this.nombre + ", soy de raza " +
                this.raza + " tengo " + this.edad + " años  y soy de tamaño " + this.tamanio);
    }
    public  void comer(){
        System.out.println("yum yum yum");
    }
    public  void dormir(){
        System.out.println("Zzz Zzz Zzzz");
    }
    public void jugar(){
        System.out.println("Urrf Arffff");
    }
}
