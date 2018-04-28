package algorithmsAnalysis.sort;

/**
 * 没写完，有函数没有实现
 * 时间复杂度：NlogN
 */
public class HeapSort {
    public static int[] heapSort(int[] a) {
        /* build heap*/
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            percDown(a, i, a.length);
        }
        for (int i = a.length - 1; i > 0; i--) {
            swapReferences(a, 0, i);//delete max
            percDown(a, 0, i);
        }
        return a;
    }

    private static void swapReferences(int[] a, int i, int i1) {

    }

    private static void percDown(int[] a, int i, int n) {
        int child;
        int tmp;
        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && a[child] < a[child + 1]) {
                child++;
            }
            if (tmp < a[child]) {
                a[i] = a[child];
            } else {
                break;
            }
            a[i]=tmp;
        }
    }

    private static int leftChild(int i) {
        return 2*i+1;
    }
}
