//Write a program to cyclically rotate an array by specified number
class CyclicRotation {

    public static void cycArray(int arr[], int n, int k) {
        for (int i = 0; i < n; i++) {
            k = k % n;
            if (i < k) {
                System.out.println(arr[n + i - k]);
            } else {
                System.out.println(arr[i - k]);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 9, 6, 3, 2, 4 };
        int n = arr.length;
        int k = 3;
        cycArray(arr, n, k);
    }
}