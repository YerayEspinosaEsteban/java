import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static final int Max_colum = 10;
    static final int Fila_colum = 10;
    static char tablero = new char[Max_colum][Fila_colum]

    static int filaBart = 0;
    static int ColumnaBart = 0;
    static int filAleatorio = 0;
    static int columnaAleatorio = 0;
    static Random Aleatorio= new Random();
    
    private statitc void AsignarTablero(char character){
        for (int i = 0; i < Max_colum; i++){
            for (int j = 0; j < Fila_colum; i++){
                tablero[i][j] = character;
            }
        }
    }

       private statitc void Imprimir(char character){
        for (int i = 0; i < Max_colum; i++){
            for (int j = 0; j < Fila_colum; i++){
            System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static void CasillaLibre(char charater, int interaciones)
    Random Aleatori = new Aleatorio 
    int filaAleatorio;
    int columnaAleatorio;
    for (int i = 0; i < interaciones; i++){
        do{
            filaAleatorio = aleatorio.nextInt(Max_colum);
            columnaAleatorio = aleatorio.nextInt(Max_colum);

        }while (tablero[filaAleatorio][columnaAleatorio]! = 'L');
        tablero[filaAleatorio][columnaAleatorio] = character
    }
    

 public static void main(String[] args) {
    AsignarTablero('L')
    Imprimir();
    }




}