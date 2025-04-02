import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(toMinimum(arr));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime) / 1000000;
        System.out.println(duration);
    }

    /*
     * This method finds the smallest element in the array
     * using an iterative approach.
     * Time complexity: O(n).
     * It iterates through each element of the array,
     * continuously updating the current minimum.
     * If a smaller element is found, it replaces the current minimum.
     * @param array The array to search through
     * @return The smallest element in the array
     */

    public static int toMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
