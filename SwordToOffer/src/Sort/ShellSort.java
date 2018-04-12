package Sort;

public class ShellSort {
    //这是以典型shell值排序的，效率不是很好
    public static void shellSort(int[] a) {
        int j;
        for (int gap=a.length/2;gap>0;gap/=2) {
            for (int i=gap;i<a.length;i++) {
                int tmp=a[i];
                for (j=i;j>=gap&&tmp<a[j-gap];j-=gap) {
                    a[j] = a[j - gap];
                }
                a[j]=tmp;
            }
        }
    }
}
