package DynamicProgramming;

import java.util.Scanner;

/**
 * 在上面的数字三角形中寻找一条从顶部到底边的路径，使得路径上所经过的数字之和最大。路径上的每一步都只能往左下或 右下走。只需要求出这个最大和即可，不必给出具体路径。 三角形的行数大于1小于等于100，数字为 0 - 99
 * <p>
 * 输入格式：
 * <p>
 * 5      //表示三角形的行数    接下来输入三角形
 * <p>
 * 7
 * <p>
 * 3   8
 * <p>
 * 8   1   0
 * <p>
 * 2   7   4   4
 * <p>
 * 4   5   2   6   5
 * <p>
 * 要求输出最大和
 */
public class NumberTriangle {
    //violentSearch
    public static int violentSearch(int n,int[][] arr) {
        return progress1(0, 0,n, arr);
    }

    private static int progress1(int i, int j, int n,int[][] arr) {
        if(i==n)
            return arr[i][j];
        int x = progress1(i + 1, j, n, arr);
        int y = progress1(i + 1, j +1, n, arr);
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        int[][] arr = new int[101][101];
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }
}
