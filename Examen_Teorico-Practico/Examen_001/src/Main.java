import java.util.Random;

public class Main {
    private static final  Random random = new Random();
    private static final int fila = 3;
    private static final int columna = 9;
    private static int[][] matriz = new int[fila][columna];
    private static void LlenarMatriz(){

        // Llenar la matriz de acuerdo al rango en cada columna
        for (int col = 0; col < matriz[0].length; col++) {
            int min = 10 + (col * 10); // valor mínimo para la columna actual
            int max = min + 9;     	// valor máximo para la columna actual

            for (int row = 0; row < matriz.length; row++) {
                matriz[row][col] = random.nextInt(max - min + 1) + min;
            }
        }
    }
    private static void Imprimir(){
        // Imprimir la matriz
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col] + "\t");
            }
            System.out.println();
        }
    }
    private static void Ordenar(){
        for (int columna = 0; columna < 9; columna++) {

            for (int i = 0; i < fila - 1; i++) {
                for (int j = i; j < fila; j++) {
                    if (matriz[i][columna] > matriz[j][columna]) {
                        int aux = matriz[i][columna];
                        matriz[i][columna] = matriz[j][columna];
                        matriz[j][columna] = aux;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        LlenarMatriz();
        Ordenar();
        Imprimir();
    }


}
