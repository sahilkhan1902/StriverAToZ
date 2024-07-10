package BasicMath.printDivison;

public class index {
    public static void printDivision(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) { // Check to avoid printing the square root twice
                    System.out.println(n/i);
                }
            }
        }
    }

    public static void main(String[] args) {
        printDivision(12);
    }
}
