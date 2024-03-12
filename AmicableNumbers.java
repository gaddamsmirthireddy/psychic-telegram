import java.util.Scanner;

public class AmicableNumbers{
    // Function to calculate the sum of proper divisors of a number
    static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;

                // If the divisors are different, add the other divisor
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum;
    }

    // Function to check if a pair of numbers is amicable
    static boolean areAmicable(int num1, int num2) {
        return sumOfDivisors(num1) == num2 && sumOfDivisors(num2) == num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        if (areAmicable(number1, number2)) {
            System.out.println("The numbers " + number1 + " and " + number2 + " are amicable.");
        } else {
            System.out.println("The numbers " + number1 + " and " + number2 + " are not amicable.");
        }

        scanner.close();
    }
}
   