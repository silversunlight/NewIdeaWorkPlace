package DynamicProgramming;

import java.util.Scanner;

/**
 * ���������ַ���A B����A��B������������У������в�Ҫ���������ģ���
 * ����������Ϊ��
 *
 * abcicba
 * abdkscab
 *
 * ab���������������У�abcҲ�ǣ�abcaҲ�ǣ�����abca���������ַ�����������С�
 */
public class ZuiChangGongGongZiXuLie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aStr = in.nextLine();
        String bStr = in.nextLine();
        int aLen = aStr.length();
        int bLen = bStr.length();
        int[][] dp = new int[aLen + 1][bLen + 1];
        for (int i = 1; i < aLen + 1; i++)
            for (int j = 1; j < bLen + 1; j++)
                if (dp[i - 1][j] == dp[i][j - 1] && aStr.charAt(i - 1) == bStr.charAt(j - 1)
                        && dp[i - 1][j] == dp[i - 1][j - 1])
                    dp[i][j] = dp[i - 1][j] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        int max = dp[aLen][bLen];
        StringBuilder sb = new StringBuilder();
        while (max > 0) {
            if (dp[aLen - 1][bLen] == dp[aLen][bLen - 1] && dp[aLen - 1][bLen] + 1 == dp[aLen][bLen]) {
                sb.append(aStr.charAt(aLen - 1));
                max--;
                aLen--;
                bLen--;
            } else {
                if (dp[aLen][bLen - 1] == dp[aLen][bLen])
                    bLen--;
                else
                    aLen--;
            }
        }

        System.out.println(sb.reverse().toString());
    }
}

