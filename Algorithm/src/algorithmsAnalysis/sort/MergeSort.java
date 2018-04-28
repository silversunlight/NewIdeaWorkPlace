package algorithmsAnalysis.sort;

/**
 * 归并排序最坏时间NlogN,所使用的比较次数几乎是最优的
 * 递归实现的
 */
public class MergeSort {
    public static void mergeSort(int[] a, int[] tmpArray, int left, int right) {
        if (left < right) {
            int center=(left+right)/2;
            mergeSort(a, tmpArray, left, center);
            mergeSort(a, tmpArray, center + 1, right);
            merge(a, tmpArray, left, center + 1, right);
        }
    }

    public static void mergeSort(int[] a) {
        int[] tmpArray = new int[a.length];
        mergeSort(a,tmpArray,0,a.length-1);
    }

    public static void merge(int[] a, int[] tmpArray, int leftPos, int rightPos, int rightEnd) {
        int leftEnd=rightPos-1;
        int tmpPos=leftPos;
        int numElements=rightEnd-leftPos+1;
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos] < a[rightPos]) {
                tmpArray[tmpPos++] = a[leftPos++];
            } else {
                tmpArray[tmpPos++] = a[rightPos++];
            }

            while (leftPos <= leftEnd) {
                tmpArray[tmpPos++] = a[leftPos++];
            }

            while (rightPos <= rightEnd) {
                tmpArray[tmpPos++] = a[rightPos++];
            }
            for (int i = 0; i < numElements; i++, rightEnd--) {
                a[rightEnd] = tmpArray[rightEnd];
            }
        }

    }
}
