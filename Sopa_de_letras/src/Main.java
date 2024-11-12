import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Random ramdom = new Random();
    private static char[] abecedario ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private static String[] palabras = {"MESA","LAMPARA","SABANA","COJIN","AGUA"};

    private static final int FILA = 10;
    private static final int COLUMNA = 10;

    private static char[][] tablero = new char[COLUMNA][FILA];

    private static void generarTablero() {
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                int aleatorio = ramdom.nextInt(abecedario.length);
                tablero[i][j] = abecedario[aleatorio];
            }
        }
    }

    private static void imprimirTablero() {
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        generarTablero();
        imprimirTablero();


        int contador = palabras.length;

        while (contador >= 0) {
            contador--;


            String palabra = palabras[ramdom.nextInt(palabras.length)];

            int direccion = ramdom.nextInt(3);
            int fila = 0;
            int columna = 0;


            switch (direccion){
                case 0:
                    fila = ramdom.nextInt(FILA);
                    columna = ramdom.nextInt(COLUMNA - palabra.length());

                    for (int i = 0; i < palabra.length(); i++) {
                        tablero[fila][columna + i] = palabra.charAt(i);
                    }
                    break;
                case 1:
                    fila = ramdom.nextInt(FILA - palabra.length());
                    columna = ramdom.nextInt(COLUMNA);

                    for (int i = 0; i < palabra.length(); i++) {
                        tablero[fila + i][columna] = palabra.charAt(i);
                    }
                    break;
                case 2:
                    fila = ramdom.nextInt(FILA - palabra.length());
                    columna = ramdom.nextInt(COLUMNA - palabra.length());

                    for (int i = 0; i < palabra.length(); i++) {
                        tablero[fila + i][columna + i] = palabra.charAt(i);
                    }
                    break;
            }
        }
        System.out.println();
        imprimirTablero();
    }
}


