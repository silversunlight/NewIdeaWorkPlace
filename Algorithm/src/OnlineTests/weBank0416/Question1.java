package OnlineTests.weBank0416;

import java.util.Scanner;

/**
 * 给出三个整数a，b，c，你需要计算数2a+2b-2c在二进制表示下1的个数。
 * 第一行包含三个整数a,b,c。1≤c＜b＜a≤109
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
