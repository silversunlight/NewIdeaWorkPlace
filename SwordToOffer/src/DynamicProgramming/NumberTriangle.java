package DynamicProgramming;

import java.util.Scanner;

/**
 * �������������������Ѱ��һ���Ӷ������ױߵ�·����ʹ��·����������������֮�����·���ϵ�ÿһ����ֻ�������»� �����ߡ�ֻ��Ҫ���������ͼ��ɣ����ظ�������·���� �����ε���������1С�ڵ���100������Ϊ 0 - 99
 * <p>
 * �����ʽ��
 * <p>
 * 5      //��ʾ�����ε�����    ����������������
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
 * Ҫ���������
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
