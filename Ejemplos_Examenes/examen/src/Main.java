import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final int Max_fila = (10);
    private static final int Max_columna = (10);
    private static final char Max_filachar = (10);
    private static final char Max_columnachar = (10);
    private static int intento = (10);
    private static String[][] TableroXX = new String[Max_columnachar][Max_filachar];
    private static String[][] TableroNumerico = new String[Max_columnachar][Max_filachar];
    private static Random aleatorio = new Random(100);
    private static Scanner leer = new Scanner(System.in);
    private static void RellenarXX(){
        for (int i = 0; i < Max_fila; i++){
            for(int j = 0; j < Max_columna; j++){
                TableroXX[i][j] = String.valueOf("XX");
            }
        }
    }
    private static void RellenarNumerico(){
        for (int i = 0; i < Max_fila; i++){
            for(int j = 0; j < Max_columna; j++){
                TableroNumerico[i][j] = String.valueOf(aleatorio.nextInt(90)+10);
            }
        }
    }
    private static void imprimirTableroNumerico() {
        for (int i = 0; i < Max_fila; i++) {
            for (int j = 0; j < Max_columna; j++) {
                System.out.print(TableroNumerico[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void imprimirTableroXX() {
        for (int i = 0; i < Max_fila; i++) {
            for (int j = 0; j < Max_columna; j++) {
                System.out.print(TableroXX[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RellenarNumerico();
        imprimirTableroNumerico();
        RellenarXX();
        imprimirTableroXX();

        int intentos = 10;

        while (intentos > 0) {
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Dame un Numerin: ");
            String usuario = leer.nextLine();

            boolean encontrado = false;

            for (int i = 0; i < Max_fila; i++) {
                for (int j = 0; j < Max_columna; j++) {
                    if (usuario.equals(TableroNumerico[i][j])) {
                        TableroNumerico[i][j] = "XX";
                        TableroXX[i][j] = "00";
                        encontrado = true;
                    }
                }
            }

            if (encontrado) {
                System.out.println("Has encontrado un número.");
                imprimirTableroXX();
                imprimirTableroNumerico();
            } else {
                System.out.println("Intenta de nuevo.");
                imprimirTableroXX();
                imprimirTableroNumerico();
                intentos--;
            }

        }

        System.out.println("Se acabaron los intentos.");
        imprimirTableroXX();
    }
}