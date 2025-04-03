import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(calcGCD(a,b));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000;
        System.out.println(duration);
    }

    /*
     * This method calculates the Greatest Common Divisor (GCD) of two numbers
     * using the recursive Euclidean Algorithm.
     * Formula: GCD(a, b) = GCD(b, a % b).
     * Base case: if b == 0, the method returns a.
     * Time complexity: O(log(min(a, b))).
     *
     * @param a The first number
     * @param b The second number
     * @return The greatest common divisor of a and b
     */

    public static int calcGCD(int a, int b) {
        if (b == 0) {return a;}
        return calcGCD(b,a%b);
    }
}