package DynamicProgramming;

import java.util.Scanner;

/**
 *
 */
public class Beibao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = in.nextInt();
        int[] dp = new int[v + 1];
        int[] price = new int[n + 1];
        int[] weight = new int[n + 1];
        long max = 0;
        for (int i = 1; i < n + 1; i++) {
            weight[i] = in.nextInt();
            price[i] = in.nextInt();
        }
        for (int i = 1; i < n + 1; i++)
            for (int j = v; j > 0; j--)
                if (j - weight[i] >= 0)
                    dp[j] = Math.max(dp[j], dp[j - weight[i]] + price[i]);
                else
                    dp[j] = dp[j];
        for (int i = 0; i < v + 1; i++)
            max = max > dp[i] ? max : dp[i];
        System.out.println(max);
    }
}
