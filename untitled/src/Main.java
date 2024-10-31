import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (containsFinAfterDecoding(input)) {
                break;
            }
            String decodedMessage = decodeMessage(input);
            int vowelCount = countVowels(decodedMessage);
            System.out.println(vowelCount);
        }

        scanner.close();
    }

    private static boolean containsFinAfterDecoding(String input) {
        String decodedMessage = decodeMessage(input);
        return decodedMessage.contains("FIN");
    }

    private static String decodeMessage(String input) {
        char shiftChar = input.charAt(0);
        StringBuilder decodedMessage = new StringBuilder();
        int shift = shiftChar - 'p';

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                char decodedChar = decodeChar(currentChar, -shift);
                decodedMessage.append(decodedChar);
            } else {
                decodedMessage.append(currentChar);
            }
        }
        return decodedMessage.toString();
    }

    private static char decodeChar(char ch, int shift) {
        char base;
        if (Character.isLowerCase(ch)) {
            base = 'a';
            return (char) ((ch - base + shift + 26) % 26 + base);
        } else if (Character.isUpperCase(ch)) {
            base = 'A';
            return (char) ((ch - base + shift + 26) % 26 + base);
        }
        return ch;
    }

    private static int countVowels(String message) {
        int count = 0;
        for (char ch : message.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
