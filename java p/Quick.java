class Quick {

    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quick(int arr[], int low, int high) {
        if (low <= high) {
            int pidx = partition(arr, low, high);

            quick(arr, low, pidx - 1);
            quick(arr, pidx + 1, high);

        }
    }

    public static void main(String args[]) {
        int arr[] = { 8, 9, 5, 4, 2, 7, 11 };
        int n = arr.length;
        quick(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }
}