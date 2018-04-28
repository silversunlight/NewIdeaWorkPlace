package algorithmsAnalysis.sort;

import java.util.Arrays;

public class InjectionSort {
    public static int[] injectionSort(int[] a) {
        int j;//jҲ���ڵ�һ��forѭ���ڶ��壬ֻ�������ռ�ÿռ�
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
//            j=i;
//            while (j > 0 && tmp < a[j-1]) {
//                a[j]=a[j-1];
//                j--;
//            }
            //while ������������for���
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
