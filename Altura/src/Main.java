import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


        while(true){
            System.out.println("Ingrese el num de bloques: ");
            int numBloques = teclado.nextInt();
            int aux = numBloques;

            if (numBloques == 0) break;

            int pisos = 0;
            int lado = 1;

            while (numBloques > 0) {
                int bloquesUsados = lado*lado;

                if (numBloques > bloquesUsados) {
                    numBloques -= bloquesUsados;
                }else {
                    numBloques = 0;
                }

                pisos++;
                lado += 2;
            }
            System.out.println(pisos + " Pisos se han completado con " + aux + " bloques");
        }

    }
}