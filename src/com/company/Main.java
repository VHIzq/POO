package com.company;

public class Main {

    public static void main(String[] args) {
        Perro lomito = new Perro();
        lomito.nombre = "Cheems";
        lomito.edad = 8;
        lomito.raza = "Alaskan Mamalute";
        lomito.tamanio = "Gigante";
        lomito.caracteristicas();
        lomito.comer();
        lomito.dormir();

        Perro lomito2 = new Perro();
        lomito2.nombre = "Alford";
        lomito2.edad = 5;
        lomito2.raza = "Husky";
        lomito2.tamanio = "Grande";
        lomito2.caracteristicas();
        lomito2.jugar();
        lomito2.comer();

        Perro lomito3 = new Perro("Milaneso");
        Perro lomito4 = new Perro("Mr. Alford", "Husky", 4, "gigante");
        lomito4.caracteristicas();
    }
}
