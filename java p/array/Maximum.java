//maximum in array

import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        int count = scanner.nextInt();
        int arr[] = new int[count];

        System.out.println("Enter " + count + " Numbers");
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < count; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("max " + max);

    }
}
