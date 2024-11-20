import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Random random = new Random();
    private static char FINAL = 'F';
    private static int vidas1 = 3;
    private static int vidas2 = 3;
    private static final int fila = 9;
    private static final int columna = 9;
    private static char[][] Tablero1 = new char[fila][columna];
    private static char[][] Tablero2 = new char[fila][columna];
    private static int filaSpecial1 = 0;
    private static int columnaSpecial1 = 0;
    private static int filaSpecial2 = 0;
    private static int columnaSpecial2 = 0;

    private static void asignarPersonajeTablero1(char personaje) {
        filaSpecial1 = random.nextInt(fila);
        columnaSpecial1 = random.nextInt(columna);

        Tablero1[filaSpecial1][columnaSpecial1] = personaje;
    }

    private static void asignarPersonajeTablero2(char personaje) {
        filaSpecial2 = random.nextInt(fila);
        columnaSpecial2 = random.nextInt(columna);

        Tablero2[filaSpecial2][columnaSpecial2] = personaje;
    }

    private static void ImprimirTablero1() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(Tablero1[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void ImprimirTablero2() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(Tablero2[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void Rellenar1() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                Tablero1[i][j] = 'L';
            }
        }
    }

    private static void Rellenar2() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                Tablero2[i][j] = 'L';
            }
        }
    }

    private static void Aleatori1(char objeto, int repeticiones) {
        int Fila = 0;
        int Columna = 0;
        for (int i = 0; i < repeticiones; i++) {
            do {
                Fila = random.nextInt(fila);
                Columna = random.nextInt(columna);
            } while (Tablero1[Fila][Columna] != 'L');
            Tablero1[Fila][Columna] = objeto;
        }
    }

    private static void Aleatori2(char objeto, int repeticiones) {
        int Fila = 0;
        int Columna = 0;
        for (int i = 0; i < repeticiones; i++) {
            do {
                Fila = random.nextInt(fila);
                Columna = random.nextInt(columna);
            } while (Tablero2[Fila][Columna] != 'L');
            Tablero2[Fila][Columna] = objeto;
        }
    }


    public static void main(String[] args) {
        Rellenar1();
        Rellenar2();
        asignarPersonajeTablero1('Y');
        asignarPersonajeTablero2('V');
        Aleatori1('D', 5);
        Aleatori2('R', 5);
        Aleatori1('M', 5);
        Aleatori2('M', 5);
        Tablero1[8][8] = FINAL;
        Tablero2[8][8] = FINAL;
        ImprimirTablero1();
        System.out.println();
        ImprimirTablero2();

        int contador = 0;

        while (vidas1 >= 0 || vidas2 >= 0) {
            Scanner leer = new Scanner(System.in);
            String movimiento = leer.nextLine();
            if (contador % 2 == 0) {
                System.out.println("Ingresa Movimiento - Tablero 1");
                System.out.println("Vidas: " + vidas1);
            } else {
                System.out.println("Ingresa Movimiento - Tablero 2");
                System.out.println("Vidas: " + vidas2);
            }
        }
        Scanner teclado = new Scanner(System.in);

        String movimiento = teclado.nextLine();

        int longitud = movimiento.length();

        if (contador % 2 == 0) {
            switch (movimiento) {
                case "W", "w":  // Movimiento hacia arriba
                    if ((filaSpecial1 - 1) >= 0) {
                        filaSpecial1 = filaSpecial1 - 1;
                        switch (Tablero1[filaSpecial1][columnaSpecial1]) {
                            case 'D':
                                vidas1 = vidas1 - 1;
                                Tablero1[filaSpecial1][columnaSpecial1] = 'Y';
                                Tablero1[filaSpecial1 + 1][columnaSpecial1] = 'L';
                                System.out.println("Has Perdido Una Vida");
                                break;
                            case 'L':
                                Tablero1[filaSpecial1][columnaSpecial1] = 'Y';
                                Tablero1[filaSpecial1 + 1][columnaSpecial1] = 'L';
                                break;
                            case 'M':
                                filaSpecial1 = filaSpecial1 + 1;
                                break;
                            case 'P':
                                Tablero1[filaSpecial1][columnaSpecial1] = 'L';
                                Tablero1[filaSpecial1 + 1][columnaSpecial1] = 'L';

                                do {
                                    filaSpecial1 = random.nextInt(fila);
                                    columnaSpecial1 = random.nextInt(columna);
                                } while (Tablero1[filaSpecial1][columnaSpecial1] != 'L');
                            {

                                Tablero1[filaSpecial1][columnaSpecial1] = 'Y';

                            }
                            break;
                        }
                    }
                    break;
            }
        }
    }
}