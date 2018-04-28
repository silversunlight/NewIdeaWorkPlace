package algorithmsAnalysis.sort;

/**
 * 希尔排序就是先指定一个gap，然后每隔gap用插入排序
 * gap逐渐缩小
 */
public class ShellSort {
    public static int[] shellSort(int[] a) {
        int j;
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int tmp = a[i];
                for (j = i; j >= gap && tmp < a[j - gap]; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j]=tmp;
            }
        }
        return a;
    }
}
