package OnlineTests.wordsJump0415;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �����ϸ����������������A=a1��a2��������an�����һ��������T���㣺
 * 1����������A�е�����Ԫ��x�����x+T������an����x+TҲ������A�е�Ԫ��
 * 2����������A�е�����Ԫ��x�����x-T��С��a1����x-TҲ������A�е�Ԫ��
 * ��ô��TΪ����A�����ڣ����ͬʱ���㣺
 * 3������С��T����������������A������
 * ���TΪA����С����
 * ��������:
 * ÿ����������������ʽΪ��
 * ��һ����һ��������N
 * �ӵڶ��п�ʼ��ÿ�������ɸ������������δ��n��a1��a2��������an��һ����N�У�Ҳ����N�����С�
 * �������:
 * �����N�У�ÿ�д�ӡ����Ӧ���е���С���ڡ�
 * ʾ��1
 * ����
 * 3
 * 3 1 2 3
 * 3 2 4 6
 * 3 3 4 6
 * ���
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
        ��ά�����ʼ���������еĻ�����nullpointer��
         */
        int[][] data = new int[n][100000];
        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextInt();
            for (int j = 1; j <= data[i][0]; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        /*
        ��һ���������������
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
        ��һ�����
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
