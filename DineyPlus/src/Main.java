
// Archivo: Main.java
import java.util.Scanner;
import ListaPeliculas.*;
import pojo.*;

public class Main {
    public static void main(String[] args) {
        ListaPeliculas lista = new ListaPeliculas(2);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar película");
            System.out.println("2. Mostrar películas");
            System.out.println("3. Eliminar película");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el título de la película: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingresa el director de la película: ");
                    String director = scanner.nextLine();
                    System.out.print("Ingresa el año de la película: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    lista.agregarPelicula(new Pelicula(titulo, director, anio));
                    System.out.println("Película agregada exitosamente.");
                    break;
                case 2:
                    lista.mostrarPeliculas();
                    break;
                case 3:
                    System.out.print("Ingresa el índice de la película a eliminar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    lista.eliminarPelicula(indice);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
