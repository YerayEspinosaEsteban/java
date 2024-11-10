import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random random = new Random();
    private static final int MAX_FILA_TABLERO = 9;
    private static final int MAX_COLUMNA_TABLERO = 9;
    private static char [][] tablero1 = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
    private static char [][] tablero2 = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
    private static int filaYoda;
    private static int columnaYoda;
    private static int filaVader;
    private static int columnaVader;
    private static char YODA = 'Y';
    private static char DARTH_VADER = 'V';
    private static char LIBRE = 'L';


    private static void imprimirTableroJugador1() {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static void imprimirTableroJugador2() {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static void asignarCaracterJugador1 (char caracter) {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                tablero1[i][j]  = caracter;
            }
        }
    }
    private static void asignarCaracterJugador2 (char caracter) {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                tablero2[i][j]  = caracter;
            }
        }
    }
    private static void asignarPersonajesJugador1(char caracter, int numRepeticiones) {
        Random aleatorio = new Random();
        int filaaleatoria = -1;
        int columnaaleatoria= -1;
        for (int i = 0; i <numRepeticiones; i++) {
            do {
                filaaleatoria = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaaleatoria = aleatorio.nextInt(MAX_COLUMNA_TABLERO);

            }while (tablero1[filaaleatoria][columnaaleatoria]!='L');
            tablero1[filaaleatoria][columnaaleatoria] = caracter;
        }
        if (caracter=='B'){
            filaYoda = filaaleatoria;
            columnaYoda = columnaaleatoria;
        }
    }
    private static void asignarPersonajesJugador2(char caracter, int numRepeticiones) {
        Random aleatorio = new Random();
        int filaaleatoria = -1;
        int columnaaleatoria= -1;
        for (int i = 0; i <numRepeticiones; i++) {
            do {
                filaaleatoria = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaaleatoria = aleatorio.nextInt(MAX_COLUMNA_TABLERO);

            }while (tablero2[filaaleatoria][columnaaleatoria]!='L');
            tablero2[filaaleatoria][columnaaleatoria] = caracter;
        }
        if (caracter=='B'){
            filaVader = filaaleatoria;
            columnaVader = columnaaleatoria;
        }
    }
    public static void main(String[] args) {
        asignarCaracterJugador1('L');
        asignarCaracterJugador2('L');
        asignarPersonajesJugador1('D', 5);
        asignarPersonajesJugador1('M', 5);
        asignarPersonajesJugador1('Y', 1);
        asignarPersonajesJugador2('R', 5);
        asignarPersonajesJugador2('M', 5);
        asignarPersonajesJugador2('V', 1);
        System.out.println("Jugador 1 Tablero");
        imprimirTableroJugador1();
        System.out.println(" ");
        System.out.println("Jugador 2 Tablero");
        imprimirTableroJugador2();
        Scanner lector = new Scanner(System.in);
        int vidasTablero1 = 3;
        int vidasTablero2 = 3;

        int contador = 0;


        while (vidasTablero1 >= 0 || vidasTablero2 >= 0) {

            System.out.println();

            if (contador % 2 == 0){
                imprimirTableroJugador1();
                System.out.println("Ingresa Movimiento - Tablero 1");
                System.out.println("Vidas: " + vidasTablero1);
            }else {
                imprimirTableroJugador2();
                System.out.println("Ingresa Movimiento - Tablero 2");
                System.out.println("Vidas: " + vidasTablero2);
            }

            Scanner teclado = new Scanner(System.in);

            String movimiento = teclado.nextLine();

            int longitud = movimiento.length();

            if (contador % 2 == 0) {
                switch (movimiento) {
                    case "W", "w":  // Movimiento hacia arriba
                        if ((filaYoda - 1) >= 0) {
                            filaYoda = filaYoda - 1;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - 1;
                                    tablero1[filaYoda][columnaYoda] = 'Y';
                                    tablero1[filaYoda + 1][columnaYoda] = 'L';
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = 'Y';
                                    tablero1[filaYoda + 1][columnaYoda] = 'L';
                                    break;
                                case 'M':
                                    filaYoda = filaYoda + 1;
                                    break;
                            }
                        }
                        break;

                    case "S", "s":  // Movimiento hacia abajo
                        if ((filaYoda + 1) < tablero1.length) {
                            filaYoda = filaYoda + 1;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - 1;
                                    tablero1[filaYoda][columnaYoda] = 'Y';
                                    tablero1[filaYoda - 1][columnaYoda] = 'L';
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = 'Y';
                                    tablero1[filaYoda - 1][columnaYoda] = 'L';
                                    break;
                                case 'M':
                                    filaYoda = filaYoda - 1;
                                    break;
                            }
                        }
                        break;

                    case "A", "a":  // Movimiento hacia la izquierda
                        if ((columnaYoda - 1) >= 0) {
                            columnaYoda = columnaYoda - 1;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - 1;
                                    tablero1[filaYoda][columnaYoda] = 'Y';
                                    tablero1[filaYoda][columnaYoda + 1] = 'L';
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = 'Y';
                                    tablero1[filaYoda][columnaYoda + 1] = 'L';
                                    break;
                                case 'M':
                                    columnaYoda = columnaYoda + 1;
                                    break;
                            }
                        }
                        break;

                    case "D", "d":  // Movimiento hacia la derecha
                        if ((columnaYoda + 1) < tablero1[0].length) {
                            columnaYoda = columnaYoda + 1;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - 1;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda][columnaYoda - 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda][columnaYoda - 1] = LIBRE;
                                    break;
                                case 'M':
                                    columnaYoda = columnaYoda - 1;
                                    break;
                            }
                        }
                        break;

                    case "Q", "q":  // Movimiento en diagonal hacia arriba a la izquierda
                        if ((filaYoda - 1) >= 0 && (columnaYoda - 1) >= 0) {
                            filaYoda = filaYoda - 1;
                            columnaYoda = columnaYoda - 1;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - 1;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + 1][columnaYoda + 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + 1][columnaYoda + 1] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda + 1;
                                    columnaYoda = columnaYoda + 1;
                                    break;
                            }
                        }
                        break;

                    case "E", "e":  // Movimiento en diagonal hacia arriba a la derecha
                        if ((filaYoda - 1) >= 0 && (columnaYoda + 1) < tablero1[0].length) {
                            filaYoda = filaYoda - 1;
                            columnaYoda = columnaYoda + 1;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - 1;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + 1][columnaYoda - 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + 1][columnaYoda - 1] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda + 1;
                                    columnaYoda = columnaYoda - 1;
                                    break;
                            }
                        }
                        break;

                    case "Z", "z":  // Movimiento en diagonal hacia abajo a la izquierda
                        if ((filaYoda + 1) < tablero1.length && (columnaYoda - 1) >= 0) {
                            filaYoda = filaYoda + 1;
                            columnaYoda = columnaYoda - 1;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - 1;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - 1][columnaYoda + 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - 1][columnaYoda + 1] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda - 1;
                                    columnaYoda = columnaYoda + 1;
                                    break;
                            }
                        }
                        break;

                    case "X", "x":  // Movimiento en diagonal hacia abajo a la derecha
                        if ((filaYoda + 1) < tablero1.length && (columnaYoda + 1) < tablero1[0].length) {
                            filaYoda = filaYoda + 1;
                            columnaYoda = columnaYoda + 1;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - 1;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - 1][columnaYoda - 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - 1][columnaYoda - 1] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda - 1;
                                    columnaYoda = columnaYoda - 1;
                                    break;
                            }
                        }
                        break;

                }
                imprimirTableroJugador1();
                System.out.println("===================");

            }else{
                switch (movimiento) {
                    case "W", "w":  // Movimiento hacia arriba
                        if ((filaVader - 1) >= 0) {
                            filaVader = filaVader - 1;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - 1;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + 1][columnaVader] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + 1][columnaVader] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader + 1;
                                    break;
                            }
                        }
                        break;

                    case "S", "s":  // Movimiento hacia abajo
                        if (( + 1) < tablero2.length) {
                            filaVader= filaVader + 1;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - 1;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - 1][columnaVader] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - 1][columnaVader] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader - 1;
                                    break;
                            }
                        }
                        break;

                    case "A", "a":  // Movimiento hacia la izquierda
                        if ((columnaVader - 1) >= 0) {
                            columnaVader = columnaVader - 1;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - 1;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero1[filaVader][columnaVader + 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader][columnaVader + 1] = LIBRE;
                                    break;
                                case 'M':
                                    columnaVader = columnaVader + 1;
                                    break;
                            }
                        }
                        break;

                    case "D", "d":  // Movimiento hacia la derecha
                        if ((columnaVader + 1) < tablero2[0].length) {
                            columnaVader = columnaVader + 1;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - 1;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader][columnaVader - 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader][columnaVader - 1] = LIBRE;
                                    break;
                                case 'M':
                                    columnaVader = columnaVader - 1;
                                    break;
                            }
                        }
                        break;
                    case "Q", "q":  // Movimiento en diagonal hacia arriba a la izquierda
                        if ((columnaVader - 1) >= 0 && (columnaVader - 1) >= 0) {
                            filaVader = filaVader - 1;
                            columnaVader = columnaVader - 1;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - 1;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + 1][columnaVader + 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + 1][columnaVader + 1] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader + 1;
                                    columnaVader = columnaVader + 1;
                                    break;
                            }
                        }
                        break;

                    case "E", "e":  // Movimiento en diagonal hacia arriba a la derecha
                        if ((filaVader - 1) >= 0 && (columnaVader + 1) < tablero2[0].length) {
                            filaVader = filaVader - 1;
                            columnaVader = columnaVader + 1;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - 1;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + 1][columnaVader - 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + 1][columnaVader - 1] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader + 1;
                                    columnaVader = columnaVader - 1;
                                    break;
                            }
                        }
                        break;

                    case "Z", "z":  // Movimiento en diagonal hacia abajo a la izquierda
                        if ((filaVader + 1) < tablero2.length && (columnaVader - 1) >= 0) {
                            filaVader = filaVader + 1;
                            columnaVader = columnaVader - 1;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - 1;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - 1][columnaVader + 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - 1][columnaVader + 1] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader - 1;
                                    columnaVader = columnaVader + 1;
                                    break;
                            }
                        }
                        break;

                    case "X", "x":  // Movimiento en diagonal hacia abajo a la derecha
                        if ((filaVader + 1) < tablero2.length && (columnaVader + 1) < tablero2[0].length) {
                            filaVader = filaVader + 1;
                            columnaVader = columnaVader + 1;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - 1;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - 1][columnaVader - 1] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - 1][columnaVader - 1] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader - 1;
                                    columnaVader = columnaVader - 1;
                                    break;
                            }
                        }
                        break;
                }
                imprimirTableroJugador2();
                System.out.println("===================");
            }
            contador ++;
        }

    }
}