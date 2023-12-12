
// Java code for Kth largest element
// in an array
import java.util.Arrays;
import java.util.Collections;

class KLargest {
    // Function to return K'th smallest
    // element in a given array
    public static int kthLargest(Integer[] arr, int K) {
        // Sort the given array
        Arrays.sort(arr);
        int n = arr.length;
        // Return K'th element in
        // the sorted array
        return arr[n - K];
    }

    // driver's code
    public static void main(String[] args) {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int K = 2;

        // Function call
        System.out.print("K'th Largest element is "
                + kthLargest(arr, K));
    }
}

// This code is contributed by Chhavi
