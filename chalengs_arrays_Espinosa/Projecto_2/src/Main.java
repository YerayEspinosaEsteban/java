import java.util.Random;
public class Main{
    private static final int FILA = 10;
    private static final int COLUMNA = 10;
    static Random aleatorio = new Random()
    private static char [][] tablero;

    public static void main(String[] args) {
        tablero = new char[FILA][COLUMNA];

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                tablero[i][j] = 10;
            }
        }

    }
}
