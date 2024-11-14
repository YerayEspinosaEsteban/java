import java.util.Scanner;

public class Main {

    private static int contarCombinaciones(String cadena) {
        if (cadena.isEmpty()) return 1;

        int total = 0;

        for (int i = 1; i <= 4 && i <= cadena.length(); i++) {

            String prefijo = cadena.substring(0, i);

            if (esDigitoValido(prefijo)) {
                total += contarCombinaciones(cadena.substring(i));
            }
        }

        return total;
    }
    private static boolean esDigitoValido(String s) {
        return s.equals("X") || s.equals("I") || s.equals("II") || s.equals("III") || s.equals("IV") ||
                s.equals("V") || s.equals("VI") || s.equals("VII") || s.equals("VIII") || s.equals("IX");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        while (leer.hasNextLine()) {
            String linea = leer.nextLine().trim();
            if (linea.isEmpty()) continue;

            int combinaciones = contarCombinaciones(linea);
            System.out.println(combinaciones);
        }
    }
}