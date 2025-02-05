package ListaPeliculas;

public class ListaPeliculas {
    private Pelicula[] peliculas;
    private int contador;

    // Constructor
    public ListaPeliculas(int numPeliculas) {
        peliculas = new Pelicula[numPeliculas];
        contador = 0;
    }

    // Método para agregar una película
    public void agregarPelicula(Pelicula pelicula) {
        if (contador == peliculas.length) { // Si el array está lleno, duplicar el tamaño
            Pelicula[] nuevoArray = new Pelicula[peliculas.length * 2];
            System.arraycopy(peliculas, 0, nuevoArray, 0, peliculas.length);
            peliculas = nuevoArray;
        }
        peliculas[contador++] = pelicula;
    }

    // Método para eliminar una película
    public void eliminarPelicula(int indice) {
        if (indice < 0 || indice >= contador) {
            System.out.println("Índice no válido.");
            return;
        }
        for (int i = indice; i < contador - 1; i++) {
            peliculas[i] = peliculas[i + 1];
        }
        peliculas[--contador] = null; // Limpiar referencia
    }

    // Método para mostrar todas las películas
    public void mostrarPeliculas() {
        if (contador == 0) {
            System.out.println("No hay películas en la lista.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(i + ". " + peliculas[i]);
            }
        }
    }
}
