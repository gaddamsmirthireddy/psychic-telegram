import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String plaintext = scanner.nextLine().toUpperCase();

        String ciphertext = encryptExchangeCipher(plaintext);

        System.out.println("The ciphertext string is: " + ciphertext);
        scanner.close(); 
    }

    private static String encryptExchangeCipher(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();

        for (char ch : plaintext.toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) ('A' + ('Z' - ch));
                ciphertext.append(encryptedChar);
            } else {
                ciphertext.append(ch); // Non-alphabetic characters remain unchanged
            }
        }

        return ciphertext.toString();
    }
}

