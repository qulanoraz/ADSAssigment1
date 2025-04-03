import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(toAverage(arr));

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(duration);
    }

    /*
     * This method computes the average of the elements in the array
     * using a for-each loop.
     * Time complexity: O(n).
     * It traverses the array, adding up all the elements,
     * and then divides the total sum by the number of elements.
     * @param array The array for which the average is to be computed
     * @return The average of the array elements
     */

    public static double toAverage(int[] arr) {
        double sum = 0;
        for (int elem : arr) {
            sum+=elem;
        }
        double res = sum / arr.length;
        return res;
    }
}