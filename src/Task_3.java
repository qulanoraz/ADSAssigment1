import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000;
        System.out.println(duration);
    }

    /*
     * This method determines if a given number is prime.
     * It uses an iterative approach.
     * Time complexity: O(√n).
     * Starting from 2, it checks for divisibility by any integer up to the square root of the number.
     * If a divisor is found, the number is composite; otherwise, it is prime.
     * @param n The number to check for primality
     * @return true if the number is prime, false if it is composite
     */

    public static boolean isPrime(int n) {
        if (n<2) {return false;}
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}