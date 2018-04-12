package NetEase;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count=0;
        for (int i=k;i<=n;i++) {
            for (int j=k;j<=n;j++) {
                if (i % j >= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
