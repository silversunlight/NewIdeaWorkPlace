package Sort;

public class InsertSort {
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i], j = i;
            if (a[j - 1] > temp) {
                while (j >= 1 && a[j - 1] > temp) {
                    a[j] = a[j - 1];
                    j--;
                }
            }
            a[j] = temp;
        }
    }
}

