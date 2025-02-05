package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AlmacenMusica almacenMusica = new AlmacenMusica();
        Cancion cancion1 = new Cancion ("Ameri", "DUKI", "POP");
        Cancion cancion2 = new Cancion ("Como Camaron", "Estopa", "Rock");
        Cancion cancion3 = new Cancion ("RAIN", "TRUENO", "Rock");
        Cancion cancion4 = new Cancion ("TROYA", "MORA", "POP");

        almacenMusica.addCancion(cancion1);
        almacenMusica.updateCancion(cancion1);
        almacenMusica.deleteCancion(cancion1);

    }
}