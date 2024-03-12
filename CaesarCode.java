import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String plaintext = scanner.nextLine().toUpperCase();

        System.out.println("The ciphertext string is: " + encryptCaesar(plaintext));
        scanner.close();
    }
    

    private static String encryptCaesar(String plaintext) {
        int shift = 3; // Fixed shift value for Caesar's Code
        StringBuilder ciphertext = new StringBuilder();

        for (char ch : plaintext.toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) ('A' + (ch - 'A' + shift) % 26);
                ciphertext.append(encryptedChar);
            } else {
                ciphertext.append(ch); // Non-alphabetic characters remain unchanged
            }
        }

        return ciphertext.toString();
    }
}
