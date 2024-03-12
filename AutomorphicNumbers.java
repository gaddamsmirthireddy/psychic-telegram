public class AutomorphicNumbers {
    static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
    public static void main(String[] args) {
        System.out.println("Automorphic numbers from 1 to 10000:");
        for (int i = 1; i <= 10000; i++) {
            if (isAutomorphic(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

