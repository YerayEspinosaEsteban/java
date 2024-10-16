import java.util.Random;
public class  Main {
    private static void main (String[] args) {
        int[] filaAleatorio = new int[10];
        Random aleatorio = new Random();
        for (int i = 0; i < filaAleatorio.length; i++) {
            filaAleatorio[i] = aleatorio.nextInt();

        }
    }
}