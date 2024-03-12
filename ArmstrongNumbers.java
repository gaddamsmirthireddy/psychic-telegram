public class ArmstrongNumbers {
    static boolean isArmstrong(int num) {
        int originalNumber, remainder, n = 0, result = 0;
        originalNumber = num;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }
        originalNumber = num; // Reset to the original number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        return result == num;
    }
    public static void main(String[] args) {
        System.out.println("Armstrong numbers below 1000:");

        for (int i = 1; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

