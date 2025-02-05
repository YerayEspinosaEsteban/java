package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AlmacenMusica implements IEstanteria{
    ArrayList<Cancion> lstCanciones;

    /* public AlmacenMusica(ArrayList<Cancion> lstCanciones) {
        this.lstCanciones = lstCanciones;
    } */
    public AlmacenMusica() {
        this.lstCanciones = new ArrayList<Cancion>();
    }

    @Override
    public void addCancion(Cancion cancion) {
        this.lstCanciones.add(cancion);
        System.out.println("Cancion agregada exitosamente: " + cancion);
    }

    @Override
    public void updateCancion(Cancion cancion) {
        Scanner leer= new Scanner(System.in);
        for (Cancion cancion1 : lstCanciones) {
            if (cancion.equals(cancion)) {

                // TITULO
                System.out.print("Ingrese el nuevo nombre de la canción: ");
                String nombre = leer.nextLine();

                cancion.setNombre(nombre);


                // ARTISTA

                System.out.print("Ingrese el nuevo artista de la canción: ");
                String artista = leer.nextLine();

                cancion.setArtista(artista);


                // GENERO

                System.out.print("Ingrese el nuevo genero de la canción: ");
                String genero = leer.nextLine();

                cancion.setGenero(genero);


                System.out.println("Canción actualizada exitosamente: " + cancion);
                return;
            }
        }
        System.out.println("Canción no encontrada en la lista: " + cancion);

    }

    @Override
    public void deleteCancion(Cancion cancion) {
        this.lstCanciones.remove(cancion);
        System.out.println("Cancion eliminada exitosamente: " + cancion);
    }


}
