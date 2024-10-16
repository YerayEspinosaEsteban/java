import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Crear un array de 6 números aleatorios entre 1 y 49 (sin repetición)
        int[] primitiva = new int[6];
        HashSet<Integer> usados = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            int num;
            do {
                num = random.nextInt(49) + 1; // Genera números entre 1 y 49
            } while (usados.contains(num)); // Asegura que no se repitan
            primitiva[i] = num;
            usados.add(num);
        }

        // Mostrar el array generado
        System.out.println("Números generados por la Primitiva: " + Arrays.toString(primitiva));

        // Pedir 3 números al usuario
        System.out.println("Introduce 3 números entre 1 y 49:");
        for (int i = 0; i < 3; i++) {
            int numUsuario = scanner.nextInt();

            // Verificar si el número existe en el array
            boolean encontrado = false;
            for (int j = 0; j < primitiva.length; j++) {
                if (primitiva[j] == numUsuario) {
                    primitiva[j] = -1;  // Se "tacha" el número
                    encontrado = true;
                }
            }

            // Mostrar el mensaje correspondiente
            if (encontrado) {
                System.out.println("Número " + numUsuario + " encontrado. Tachado.");
            } else {
                System.out.println("Número " + numUsuario + " no encontrado. Es un paquete.");
            }
        }

        // Reemplazar los números tachados (-1) con "XX"
        String[] resultado = new String[6];
        for (int i = 0; i < primitiva.length; i++) {
            if (primitiva[i] == -1) {
                resultado[i] = "XX";
            } else {
                resultado[i] = String.valueOf(primitiva[i]);
            }
        }

        // Mostrar el array final
        System.out.println("Resultado final: " + Arrays.toString(resultado));
    }
}

