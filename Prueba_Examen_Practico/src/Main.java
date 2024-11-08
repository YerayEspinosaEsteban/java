import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MAX_FILA_TABLERO = 9;
    private static final int MAX_COLUMNA_TABLERO = 9;
    private static char [][] Jugador1 = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
    private static char [][] Jugador2 = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
    private static int filaYoda;
    private static int columnYoda;
    private static int filaVader;
    private static int columnVader;

    private static void imprimirTableroJugador1() {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                System.out.print(Jugador1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static void imprimirTableroJugador2() {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                System.out.print(Jugador2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static void asignarCaracterJugador1 (char caracter) {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                Jugador1[i][j]  = caracter;
            }
        }
    }
    private static void asignarCaracterJugador2 (char caracter) {
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                Jugador2[i][j]  = caracter;
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

            }while (Jugador1[filaaleatoria][columnaaleatoria]!='L');
            Jugador1[filaaleatoria][columnaaleatoria] = caracter;
        }
        if (caracter=='B'){
            filaYoda = filaaleatoria;
            columnYoda = columnaaleatoria;
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

            }while (Jugador2[filaaleatoria][columnaaleatoria]!='L');
            Jugador2[filaaleatoria][columnaaleatoria] = caracter;
        }
        if (caracter=='B'){
            filaVader = filaaleatoria;
            columnVader = columnaaleatoria;
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
        int vidas1 = 3;
        int vidas2 = 3;
        do {
            System.out.println("Dime el desplazamiento que quieres realizar");
            System.out.println("W → Arriba, S → Abajo, A → Izquierda, D → Derecha");
            String desplazamiento = lector.nextLine();
            System.out.println("Desplazamiento=" + desplazamiento);

            switch (desplazamiento) {
                case "W":
                    if ((filaYoda - 1) >= 0) {
                        filaYoda = filaYoda - 1;
                        switch (Jugador1[filaYoda][columnYoda]) {
                            case 'D':
                                vidas1 = vidas1 - 1;
                                Jugador1[filaYoda][columnYoda] = 'Y';
                                Jugador1[filaYoda + 1][columnYoda] = 'L';
                                System.out.println("Has perdido 1 Vida te quedan " + vidas + "Vidas");
                                break;
                            case 'L':
                                Jugador1[filaYoda][columnYoda] = 'Y';
                                Jugador1[filaYoda + 1][columnVader] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla");
                                filaYoda = filaYoda + 1;
                                break;
                        }
                    } else {
                    }
            }
        }
    }
}