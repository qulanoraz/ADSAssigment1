import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(myPow(a,n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000;
        System.out.println(duration);
    }

    /*
     * This method computes the value of a raised to the power of n (a^n)
     * using recursion.
     * Base case: if n == 0, the method returns 1 (since any number raised to the power of 0 is 1).
     * Recursive cases:
     *   - If n > 0, it returns a * My_pow(a, n - 1).
     *   - If n < 0, it returns 1 / My_pow(a, -n).
     * Time complexity: O(n).
     *
     * @param a The base number
     * @param n The exponent
     * @return The result of a raised to the power of n
     */

    public static double myPow(int a, int n) {
        if (n==0) {
            return 1;
        } else if (n<0) {
            return 1 / myPow(a,-n);
        }
        return a * myPow(a,n-1);
    }
}