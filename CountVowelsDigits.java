import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);
        int digitCount = countDigits(input);

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }

    private static int countVowels(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    private static int countDigits(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
