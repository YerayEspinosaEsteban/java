package simpsonprogfuncional;

import java.util.Random;
import java.util.Scanner;

public class SimpsonProgFuncional {

    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char [][] tablero;
    private static int filaBart;
    private static int columnaBart;

    private static void imprimirTablero() {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private static void asignarCaracterACasillas (char caracter) {
        //2º rellenar tablero
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = caracter;
            }
        }
    }

    private static void asignarPersonajesACasillasLibre (char caracter, int numRepeticiones) {
        Random aleatorio = new Random();
        int filaaleatoria = -1;
        int columnaaleatoria= -1;
        for (int i = 0; i <numRepeticiones; i++) {
            do {
                filaaleatoria = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaaleatoria = aleatorio.nextInt(MAX_COLUMNA_TABLERO);

            }while (tablero[filaaleatoria][columnaaleatoria]!='L');
            tablero[filaaleatoria][columnaaleatoria] = caracter;
        }
        if (caracter=='B'){
            filaBart = filaaleatoria;
            columnaBart = columnaaleatoria;
        }
    }

//    private static void asignarCaracterACasillasLibres (char caracter) {
//        Random aleatorio = new Random();
//        int filaleatorioHomer;
//        int columnaaleatorioHomer;
//        for (int i = 0; i < 10; i++) {
//            do {
//                filaleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);
//                columnaaleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
//
//            }while (tablero[filaleatorioHomer][columnaaleatorioHomer]!='L');
//
//            tablero[filaleatorioHomer][columnaaleatorioHomer] = caracter;
//        }
//    }

    public static void main(String[] args) {
        //1º inicio matriz tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        //2º Asigno un caracter a la matriz
        asignarCaracterACasillas('L');

        System.out.println();

        imprimirTablero();

        //3º Asigno a bart
        asignarPersonajesACasillasLibre('B', 1);

        System.out.println();

        imprimirTablero();


        //4º Asigno a 10 Homers
        asignarPersonajesACasillasLibre('H', 10);

        System.out.println();

        imprimirTablero();


        //5º Creo 10 Muros
        asignarPersonajesACasillasLibre('M', 10);

        System.out.println();

        imprimirTablero();

        // Final
        tablero[MAX_FILA_TABLERO - 1][MAX_COLUMNA_TABLERO - 1] = 'F';

        System.out.println();

        imprimirTablero();

        /*Desplazamiento de Bart*/
        /*A--> Izquierda*/
        /*S--> ABAJO*/
        /*D--> DERECHA*/
        /*W--> ARRIBA*/
        Scanner lector = new Scanner(System.in);
        int vidas=10;
        do {
            System.out.println("Diem el desplazamiento que quieres realizar");
            System.out.println("A--> Izquierda, S-->Abajo, D--> Derecha w--> Arriba");
            String desplazamiento = lector.nextLine();
            System.out.println("Desplazamiento" + desplazamiento);

            switch (desplazamiento) {
                case "A"://IZQUIERDA
                    if ((columnaBart - 1) >= 0) {
                        filaBart = filaBart;
                        columnaBart = columnaBart - 1;
                        switch (tablero[filaBart][columnaBart]){
                            case 'H':
                                vidas = vidas-1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                System.out.println("Has perdido una vida" + "Te quedan " + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                            case 'M':
                                System.out.println("El muro no te deja desplazarte");
                                columnaBart = columnaBart + 1;
                                break;
                        }
                    } else {
                        System.out.println("Desplazamiento prohibido.Limite de tablero");
                    }
                    break;
                case "S"://ABAJO
                    filaBart = filaBart - 1;
                    columnaBart = columnaBart;
                    tablero[filaBart][columnaBart] = 'B';
                    tablero[filaBart + 1][columnaBart] = 'L';
                    break;
                case "D":
                    break;
                case "W":
                    break;

            }
            imprimirTablero();
        }while (vidas>0);
    }

}