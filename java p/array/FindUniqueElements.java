import java.util.Scanner;

public class FindUniqueElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the maximum element in the array to determine the size of the visited
        // array
        int maxElement = arr[0];
        //
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // Create a boolean array to mark the unique elements as visited or not
        boolean[] visited = new boolean[maxElement + 1];

        // Print the unique elements in the array
        for (int i = 0; i < n; i++) {
            if (!visited[arr[i]]) {
                System.out.print(arr[i] + " ");

                // Mark the element as visited
                visited[arr[i]] = true;
            }
        }
    }
}
