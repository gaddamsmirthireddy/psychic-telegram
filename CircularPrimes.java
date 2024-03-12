public class CircularPrimes {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to rotate the digits of a number
    static int rotate(int num) {
        int numDigits = (int) Math.log10(num) + 1;
        int pow10 = (int) Math.pow(10, numDigits - 1);
        int firstDigit = num / pow10;
        return (num % pow10) * 10 + firstDigit;
    }

    // Function to check if a number is a circular prime
    static boolean isCircularPrime(int num) {
        int rotated = num;
        do {
            if (!isPrime(rotated)) {
                return false;
            }
            rotated = rotate(rotated);
        } while (rotated != num);

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Circular primes from 1 to 1000:");

        for (int i = 2; i <= 1000; i++) {
            if (isCircularPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

