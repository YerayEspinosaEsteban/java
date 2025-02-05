package org.example;

public class Biblioteca {
    private static final int CAPACIDAD = 3;
    private static Libro[] libros = new Libro[CAPACIDAD];
    private static int contadorLibros = 0;

    public void agregarLibro(Libro libro) {
        if (contadorLibros < CAPACIDAD) {
            libros[contadorLibros] = libro;
            contadorLibros++;
            System.out.println("El libro tiene espacio");
        }else{
            System.out.println("El libro no cabe");
        }
    }

    public void listarLibro(){
        //foreach para objetos
        for (Libro libro:libros) {
            System.out.println(libro.toString());
        }

    }

    public Libro buscarLibro(String titulo){
        for (Libro libro:libros) {
            if (libro.getTitulo().equals(titulo));
            return libro;
        }
        return null;
    }

    public Libro pestarLibro(String titulo){
        Libro libro = buscarLibro(titulo);
        if (libro.isDisponible()) {
             libro.setDisponible(false);
            System.out.println("El libro ha sido prestado,  ya no esta..");
        } else {
            System.out.println("El libro no está disponible.Busca otro");
        }
        return libro;
    }

    public Libro devolverLibro(String titulo){
        Libro libro = buscarLibro(titulo);
        if (!libro.isDisponible()) {
            libro.setDisponible(true);
            System.out.println("El libro ha sido devuelto, ya lo tienes de vuelta.");
        }
        return libro;
    }

}

