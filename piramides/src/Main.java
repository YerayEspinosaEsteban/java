import java.util.Scanner;

public class Main {


    private static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {


        System.out.print("Ingrese el numero de intentos que vas a hacer: ");
        int Pruebas = teclado.nextInt();
        System.out.println("Tienes: " + Pruebas + " Intentos");


        for (int i = 0; i < Pruebas; i++) {

            System.out.print("Ingrese A: ");
            int A = teclado.nextInt();
            System.out.print("Ingrese B: ");
            int B = teclado.nextInt();
            System.out.print("Ingrese C: ");
            int C = teclado.nextInt();


            int distanciaA = (A-B)*(A-B);
            int distanciaC = (B-C)*(B-C);


            if (distanciaA < distanciaC) {
                System.out.println(A + " esta mas cerca de " + B );
            } else if (distanciaC < distanciaA) {
                System.out.println(C + " esta mas cerca de " + B );
            }else {
                System.out.println("EMPATE ambos estan a la misma distancia");
            }
        }
    }
}