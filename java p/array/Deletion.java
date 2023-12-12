//deletion

import java.util.Scanner;

public class Deletion {

    public static int search(int arr[], int del) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                return i;
            }
        }
        return -1;
    }

    public static int delete(int arr[], int n, int del) {

        int pos = search(arr, del);
        if (pos == -1) {
            System.out.println(" not found");
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to delete : ");
        int del = sc.nextInt();

        System.out.println("after deletion ");
        int size = delete(arr, n, del);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
