
class SubArraySum {

    public static void CalSubSum(int arr[], int sum, int n) {
        for (int i = 0; i < n; i++) {
            int CurrSum = arr[i];
            if (CurrSum == sum) {
                System.out.println("Sum is found at index " + i);
                return;
            } else {
                for (int j = i + 1; j < n; j++) {
                    CurrSum += arr[j];
                    if (CurrSum == sum) {
                        System.out.println("Sum is found at index " + i + " to " + j);

                    }

                }
            }
        }
        System.out.println("No Sum is found");
        return;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        int sum = 33;
        int n = arr.length;
        CalSubSum(arr, sum, n);
    }
}