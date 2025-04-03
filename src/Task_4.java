import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(toFactorial(n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }

    /*
     * This method computes the factorial of a given number n
     * using recursion.
     * Time complexity: O(n).
     * The recursion proceeds from n down to 1.
     * If n is 0, it returns 1, since 0! is defined as 1.
     * @param n The number for which the factorial is to be computed
     * @return The factorial of n
     */

    public static int toFactorial(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        return n * toFactorial(n-1);
    }
}