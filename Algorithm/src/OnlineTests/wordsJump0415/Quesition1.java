package OnlineTests.wordsJump0415;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对于严格递增的正整数数列A=a1、a2、……、an，如果一个正整数T满足：
 * 1）对于数列A中的任意元素x，如果x+T不大于an，则x+T也是数列A中的元素
 * 2）对于数列A中的任意元素x，如果x-T不小于a1，则x-T也是数列A中的元素
 * 那么称T为数列A的周期，如果同时满足：
 * 3）所有小于T的正整数，都不是A的周期
 * 则称T为A的最小周期
 * 输入描述:
 * 每组测试样本的输入格式为：
 * 第一行是一个正整数N
 * 从第二行开始，每行有若干个正整数，依次存放n、a1、a2、……、an，一共有N行，也就是N个数列。
 * 输出描述:
 * 输出有N行，每行打印出对应数列的最小周期。
 * 示例1
 * 输入
 * 3
 * 3 1 2 3
 * 3 2 4 6
 * 3 3 4 6
 * 输出
 * 1
 * 2
 * 3
 */
public class Quesition1 {
    public static int getResult(int[] eachLine) {
        int n = eachLine[0];
        for (int i = 1; ; i++) {
            for (int j = 1; j <= n; j++) {
                if ((Arrays.binarySearch(eachLine, 1, n, eachLine[j] + i) > 0)
                        &&(Arrays.binarySearch(eachLine,1,n,eachLine[j]-i))>0) {
                    return i;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        二维数组初始化不给定列的话？会nullpointer？
         */
        int[][] data = new int[n][100000];
        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextInt();
            for (int j = 1; j <= data[i][0]; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        /*
        试一下数组里面放链表
         */
//        List<Integer>[] data = new ArrayList[n];
//        for (int i = 0; i < n; i++) {
//            data[i].add(sc.nextInt());
//            for (int j = 0; j < data[i].get(0); j++) {
//                data[i].add(sc.nextInt());
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(data[i]);
//        }
        /*
        试一下输出
         */
//        System.out.println(n);
//        for (int i = 0; i < n; i++) {
//            System.out.print(data[i][0] + " ");
//            for (int j = 1; j <= data[i][0]; j++) {
//                if (j == data[i][0]) {
//                    System.out.println(data[i][j]);
//                } else {
//                    System.out.print(data[i][j]+" ");
//                }
//            }
//        }
        for (int i = 0; i < n; i++) {
            System.out.println(getResult(data[i]));
        }
    }
}
