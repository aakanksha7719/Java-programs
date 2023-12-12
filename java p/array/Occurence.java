//Find the occurrence of an integer in the array

import java.util.Scanner;

public class Occurence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        int count = sc.nextInt();
        int arr[] = new int[count];

        int occ = 0;

        System.out.println("Enter " + count + " Numbers");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to find occurence: ");
        int key = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (arr[i] == key) {
                occ++;
            }
        }

        System.out.println("occ of  " + key + " is " + occ);

    }
}
