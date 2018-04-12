package Sort;

public class SelectionSort {
    public static void sort(int[] a) {
        int i,j;
        int temp=0;
        int flag=0;
        int n=a.length;
        for (i=0;i<n;i++) {
            temp=a[i];
            flag=i;
            for (j=i+1;j<n;j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    flag=j;
                }
            }
            if (flag != i) {
                a[flag]=a[i];
                a[i]=temp;
            }
        }
    }
}
