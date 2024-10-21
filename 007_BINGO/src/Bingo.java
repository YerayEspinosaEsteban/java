import java.util.Random;

 public class Bingo {
    private static final int FILA = 3;
    private static final int COLUMNA = 9;

    private static int[][] tablero;

    private static void RellenarBingo(){
        Random rand = new Random();
        for (int col = 0; col < COLUMNA; col++){
            int min = 10 + col *10;
            int max = min + 9;
            for (int fil = 0; fil <FILA; fil++){
                tablero[fil][col] = rand.nextInt((max - min) + 1) + min;
            }
        }
    }
    private static void OrdenarTablero(){
        for (int col = 0; col < COLUMNA; col++) {
            for (int i = 0; i < FILA - 1; i++) {
                for (int j = 0; j < FILA - i - 1; j++) {
                    if (tablero[j][col] > tablero[j + 1][col]) {
                        int temp = tablero[j][col];
                        tablero[j][col] = tablero[j + 1][col];
                        tablero[j + 1][col] = temp;
                    }
                }
            }
        }
    }
    private static void MostrarBingo(){
        for (int i = 0; i <FILA; i++){
            for (int j = 0; j < COLUMNA; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    tablero = new int[FILA][COLUMNA];
    RellenarBingo();
    OrdenarTablero();
    MostrarBingo();

    }
}