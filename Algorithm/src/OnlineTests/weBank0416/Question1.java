package OnlineTests.weBank0416;

import java.util.Scanner;

/**
 * ������������a��b��c������Ҫ������2a+2b-2c�ڶ����Ʊ�ʾ��1�ĸ�����
 * ��һ�а�����������a,b,c��1��c��b��a��109
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((b-c+1));
    }
}
