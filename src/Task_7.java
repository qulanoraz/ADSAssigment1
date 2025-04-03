import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        toReverse(scanner,n);

        System.out.println();
        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000;
        System.out.println(duration);
    }

    /*
     * This method prints a sequence of numbers in reverse order
     * using recursion.
     * Time complexity: O(n), as each recursive call handles one element.
     * The method reads the input values recursively and prints them after
     * the recursion unwinds, thus reversing the order.
     *
     * @param n The number of elements in the sequence (length of input)
     * @return None (the method outputs the reversed sequence)
     */

    public static void toReverse(Scanner scan, int n) {
        if (n==0) {return;}
        int curNum = scan.nextInt();
        toReverse(scan,n-1);
        System.out.print(curNum+" ");
    }
}