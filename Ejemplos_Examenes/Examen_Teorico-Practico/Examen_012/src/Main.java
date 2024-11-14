public class Main {
    private static int[] numeros = {4, 2, 9, 1, 5, 3};
    private static int objetivo = 10;
    private static boolean encontrado = false;
    private static void Econtrar(){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo) {
                encontrado = true;
                if (encontrado) {
                    System.out.println("Número encontrado");
                }

            }
        } System.out.println("Número no encontrado");

    }

    public static void main(String[] args) {
    Econtrar();


    }
}

