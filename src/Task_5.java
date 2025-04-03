import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(toFib(n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000;
        System.out.println(duration);
    }

    /*
     * This method returns the nth number in the Fibonacci sequence
     * using recursion.
     * Time complexity: O(2^n), due to repeated recursive calls —
     * each call creates two more, resulting in exponential growth.
     *
     * @param n The position (index) in the Fibonacci sequence
     * @return The nth Fibonacci number
     */

    public static int toFib(int n) {
        if (n==0 || n==1) {return n;}
        return toFib(n-1) + toFib(n-2);
    }
}