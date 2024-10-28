import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static final int Max_colum = 10;
    static final int Fila_colum = 10;
    static char[][] tablero;

    static int filaBart = 0;
    static int ColumnaBart = 0;
    static int filAleatorio = 0;
    static int columnaAleatorio = 0;
    static Random Aleatorio= new Random();

    private static void AsignarTablero(char character){
        for (int i = 0; i < Max_colum; i++){
            for (int j = 0; j < Fila_colum; j++){
                tablero[i][j] = character;
            }
        }
    }

    private static void Imprimir(){
        for (int i = 0; i < Max_colum; i++){
            for (int j = 0; j < Fila_colum; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static void asignarPersonajesACasillasLibre (char character, int numRepeticiones) {
        Random aleatorio = new Random();
        int filaaleatoria;
        int columnaaleatoria;
        for (int i = 0; i <numRepeticiones; i++) {
            do {
                filaaleatoria = aleatorio.nextInt(Max_colum);
                columnaaleatoria = aleatorio.nextInt(Fila_colum);

            }while (tablero[filaaleatoria][columnaaleatoria]!='L');
            tablero[filaaleatoria][columnaaleatoria] = character;
        }
    }


    public static void main(String[] args) {
        tablero = new char[Max_colum][Fila_colum];

        AsignarTablero('L');
        System.out.println();
        asignarPersonajesACasillasLibre('S', 5 );
        asignarPersonajesACasillasLibre('M',90);
        tablero[]
        System.out.println();
        Imprimir();
        System.out.println();

    }




}