//minimum in array

import java.util.Scanner;

public class Minimum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        int count = scanner.nextInt();
        int arr[] = new int[count];

        System.out.println("Enter " + count + " Numbers");
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < count; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min " + min);

    }
}
