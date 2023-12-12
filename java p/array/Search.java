//linear search

import java.util.*;

class Search {
    public static void main(String args[]) {
        System.out.println("Enter no of elements : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched  : ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("found at" + i);

            }

        }

    }
}
