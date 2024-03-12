import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a ciphertext string: ");
        String ciphertext = scanner.nextLine().toUpperCase();

        System.out.println("The plaintext string is: " + decryptCaesar(ciphertext));
        scanner.close();  
    }

    private static String decryptCaesar(String ciphertext) {
        int shift = 3; // Fixed shift value for Caesar's Code
        StringBuilder plaintext = new StringBuilder();

        for (char ch : ciphertext.toCharArray()) {
            if (Character.isLetter(ch)) {
                char decryptedChar = (char) ('A' + (ch - 'A' - shift + 26) % 26);
                plaintext.append(decryptedChar);
            } else {
                plaintext.append(ch); // Non-alphabetic characters remain unchanged
            }
        }

        return plaintext.toString();
    }
}
