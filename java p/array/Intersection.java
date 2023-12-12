//intersection

class Intersection {

    public static void main(String args[]) {
        int arr1[] = { 4, 2, 5, 9, 6, 3 };
        int arr2[] = { 5, 4, 2, 3, 4 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[j]);
                }
            }
        }
    }
}