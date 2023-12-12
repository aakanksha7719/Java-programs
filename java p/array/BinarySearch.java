//linear search

import java.util.*;

class BinarySearch {

    public static int BSearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {

            int mid = (high + low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        System.out.println("Enter no of elements : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched  : ");
        int key = sc.nextInt();

        System.out.println("Element is found at " + BSearch(arr, key));

    }
}
