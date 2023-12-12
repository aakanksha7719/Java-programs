//Schro
//0 0 0 0 0 1 1 1  2 2 2 

class CountZot {

    public static void main(String arsg[]) {
        int arr[] = { 0, 1, 2, 0, 1, 0, 2, 1, 0, 2, 2, 0, 1, 1, 2 };
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
