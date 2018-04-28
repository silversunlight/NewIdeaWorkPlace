package algorithmsAnalysis.sort;

import java.util.Arrays;

public class InjectionSort {
    public static int[] injectionSort(int[] a) {
        int j;//j也可在第一个for循环内定义，只不过会多占用空间
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
//            j=i;
//            while (j > 0 && tmp < a[j-1]) {
//                a[j]=a[j-1];
//                j--;
//            }
            //while 基本都可以用for替代
            for (j = i; j > 0 && tmp < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {7, 6, 5, 4, 3, 8, 9};
        System.out.println(Arrays.toString(injectionSort(a)));
    }
}
