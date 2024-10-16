import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Random alea = new Random();
    Scanner leer = new Scanner(System.in);

    String arrayPrimitiva[] = new String[6];
    for (int i = 0; i < arrayPrimitiva.length; i++) {
        int numAle = alea.nextInt(100);
        arrayPrimitiva[i] = String.valueOf(numAle);
    }
    for (int i = 0; i < arrayPrimitiva.length; i++) {
        System.out.println(arrayPrimitiva[i]);

       }
        System.out.println("Dame un numero");
        String cadUsuario = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "xx";
            }
        }
        System.out.println("Dame un numero");
        String cadUsuario2 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario2.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "xx";
            }
        }
        System.out.println("Dame un numero");
        String cadUsuario3 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario3.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "xx";
            }
        }
        System.out.println("Dame un numero");
        String cadUsuario4 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario4.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "xx";
            }
        }
        System.out.println("Dame un numero");
        String cadUsuario5 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario5.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "xx";
            }
        }
        System.out.println("Dame un numero");
        String cadUsuario6 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario6.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "xx";
            }
        }
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            System.out.println(arrayPrimitiva[i]);
        }
    }
}