import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.println("Introduzca Numero de Huevos: ");
            int h = leer.nextInt();
            System.out.println("Introduzca la Capacidad:   ");
            int c = leer.nextInt();

            if (h == 0 && c == 0) break;

            int tandas = (h + c - 1) / c;
            int tiempoTotal = tandas * 10;

            System.out.println("Tiempo total: " + tiempoTotal);
        }
    }
}