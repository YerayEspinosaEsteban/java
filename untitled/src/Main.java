import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] simbolos = {'H', 'R', 'D', 'F', 'C', 'G', 'T'}; // De 1,000,000 a 1
        int[] valores = {1000000, 100000, 10000, 1000, 100, 10, 1};

        while (true) {
            System.out.print("Dame un numero para convertir a jerogrifico: ");
            int numero = scanner.nextInt();

            if (numero == 0) break;
            if (numero > 100000 || numero < 0) {
                System.out.println("El numero es Invalido");
                break;
            }

            StringBuilder resultado = new StringBuilder();


            for (int i = 0; i < valores.length; i++) {
                int cantidad = numero / valores[i];
                numero %= valores[i];

                for (int j = 0; j < cantidad; j++) {
                    resultado.append(simbolos[i]);
                }
            }

            System.out.println(resultado.toString());
        }

        scanner.close();
    }
}