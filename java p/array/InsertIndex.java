//inserting element at any position

import java.util.Scanner;

public class InsertIndex {

    public static void main(String[] args) {
        int count, i, num, index;
        int input[] = new int[100];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        count = scanner.nextInt();

        System.out.println("Enter " + count + " Numbers");
        for (i = 0; i < count; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.println("Enter Number to be Inserted");
        num = scanner.nextInt();
        System.out.println("Enter Index of Insertion");
        index = scanner.nextInt();

        for (i = count; i > index; i--) {
            input[i] = input[i - 1];
        }
        // inserting num at position "index"
        input[index] = num;
        // increment size of array
        count++;

        System.out.println("Final Array");
        for (i = 0; i < count; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

/*
 * for(int i=count;i>index;i--)
 * {
 * arr[i]=arr[i-1];
 * }
 */