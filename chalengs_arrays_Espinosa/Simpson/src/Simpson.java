import java.util.Scanner;
import java.util.Random;

public class Simpson {
    private static final int filaTablero = 10;
    private static final int columnaTablero = 10;
    private static char[][] tablero;
    private static int filaBart;
    private static int columnaBart;

    private static void AsignarCasillas (char caracter){
        for (int i = 0; i < filaTablero; i++) {
            for (int j = 0; j < columnaTablero; j++) {
                tablero [i][j]= caracter;

            }
            
        }
    }
    private static void ImprimirTablero(){
        for (int i = 0; i <filaTablero ; i++) {
            for (int j = 0; j <columnaTablero ; j++) {
                System.out.print(tablero[i][j]+" ");

            }
            System.out.println(" ");
        }
    }
    private static void AsignarLibrescaSillas (char caracter,int repeticiones){
        Random aleatori = new Random();
        int filaAleatoria = -1;
        int columnaAleatoria = -1;
        for (int i = 0; i < repeticiones; i++) {
        do {
            filaAleatoria = aleatori.nextInt(filaTablero);
            columnaAleatoria = aleatori.nextInt(columnaTablero);

        }while (tablero[filaAleatoria][columnaAleatoria]!='L');
        tablero[filaAleatoria][columnaAleatoria]= caracter;

        }
        if (caracter =='B' ){
            filaBart = filaAleatoria;
            columnaBart = columnaAleatoria;
        }
    }
    public static void main (String[] args){
        tablero = new char[filaTablero][columnaTablero];

        AsignarCasillas('L');
        System.out.println();
        ImprimirTablero();

        AsignarLibrescaSillas('B',1);
        System.out.println();
        ImprimirTablero();

        AsignarLibrescaSillas('H',10);
        System.out.println();
        ImprimirTablero();

        AsignarLibrescaSillas('M',10);
        System.out.println();
        ImprimirTablero();

        tablero[filaTablero -1][columnaTablero -1]='F';
        System.out.println();
        ImprimirTablero();

        Scanner lector = new Scanner(System.in);
        int vidas =10;
        do{
            System.out.println("Dime hacia donde te quieres mover");
            String desplazamiento = lector.nextLine();
            System.out.println("Desplazamiento=" + desplazamiento);

            switch (desplazamiento) {
                case "W":
                    if ((filaBart - 1) >= 0) {
                        filaBart = filaBart - 1;
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart + 1][columnaBart] = 'L';
                                System.out.println("Has perdido 1 Vida te quedan " + vidas + "Vidas");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart + 1][columnaBart] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla");
                                filaBart = filaBart + 1;
                                break;
                        }
                    } else {
                        System.out.println("Desplazamiento prohibido. Limite de Tablero");
                    }
                    break;
                case "A":
                    if ((columnaBart - 1) >= 0) {
                        columnaBart = columnaBart - 1;
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                System.out.println("Has perdido 1 Vida te quedan " + vidas + "Vidas");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla");
                                columnaBart = columnaBart + 1;
                                break;
                        }
                    } else {
                        System.out.println("Desplazamiento prohibido. Limite de Tablero");
                    }
                    break;
                case "S":
                    if ((filaBart + 1) >= 0) {
                        filaBart = filaBart + 1;
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart - 1][columnaBart] = 'L';
                                System.out.println("Has perdido 1 Vida te quedan " + vidas + "Vidas");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart - 1][columnaBart] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla");
                                filaBart = filaBart - 1;
                                break;
                        }
                    } else {
                        System.out.println("Desplazamiento prohibido. Limite de Tablero");
                    }
                    break;
                case "D":
                    if ((columnaBart + 1) >= 0) {
                        columnaBart = columnaBart + 1;
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart - 1] = 'L';
                                System.out.println("Has perdido 1 Vida te quedan " + vidas + "Vidas");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart - 1] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla");
                                columnaBart = columnaBart - 1;
                                break;
                        }
                    } else {
                        System.out.println("Desplazamiento prohibido. Limite de Tablero");
                    }
                    break;
                default:
                    break;



            }
            ImprimirTablero();

        }while(vidas > 0);

    }

}