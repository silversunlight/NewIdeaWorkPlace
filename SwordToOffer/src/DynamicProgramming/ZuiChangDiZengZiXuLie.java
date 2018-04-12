package DynamicProgramming;

import java.util.Scanner;

/**
 * 给出长度为N的数组，找出这个数组的最长递增子序列。
 * (递增子序列是指，子序列的元素是递增的）
 * 例如：5 1 6 8 2 4 5 10，最长递增子序列是1 2 4 5 10。
 */
public class ZuiChangDiZengZiXuLie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] L = new int[n];
        for (int j = 0; j < n; j++)
            L[j] = in.nextInt();

        double[] B = new double[n + 1];
        B[0] = Integer.MIN_VALUE;
        B[1] = L[0];
        int Len = 1;
        int p, r, m;
        for (int i = 1; i < n; i++) {
            p = 0;
            r = Len;
            while (p <= r) {
                m = (p + r) / 2;
                if (B[m] < L[i])
                    p = m + 1;
                else
                    r = m - 1;
            }
            B[p] = L[i];
            if (p > Len)
                Len++;
        }
        System.out.println(Len);
    }
}
