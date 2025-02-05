package pojo;

import java.util.ArrayList;

public class AlamacenarCanciones {
    private ArrayList<Cancion> listaCanciones;

    public AlamacenarCanciones(){
        this.listaCanciones = new ArrayList<>();
    }
    public void add(Cancion cancion){
        this.listaCanciones.add(cancion);
        System.out.println("Cancion añadidad" + cancion);
    }

    public void delete(String titulo) {
        // Verifica si se eliminó alguna canción
        boolean eliminada = listaCanciones.removeIf(c -> c.getTitulo().equalsIgnoreCase(titulo));

        if (eliminada) {
            System.out.println("Canción eliminada: " + titulo);
        } else {
            System.out.println("No se encontró la canción: " + titulo);
        }
    }

    public void imprimir() {
        if (listaCanciones.isEmpty()) {
            System.out.println("No hay canciones en la lista.");
        } else {
            System.out.println("Lista de Canciones:");
            for (Cancion c : listaCanciones) {
                System.out.println(c);
            }
        }
    }
}
