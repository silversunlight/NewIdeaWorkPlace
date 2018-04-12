package Tencent;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int length1 = sc.nextInt();
        int number1 = sc.nextInt();
        int length2 = sc.nextInt();
        int number2 = sc.nextInt();
//        BigDecimal result = new BigDecimal(0);
//        BigDecimal one = new BigDecimal(1);
        int result=0;
        if (k < length1 || k < length2) {
            System.out.println(0);
        } else {
            for (int i = 0; i * length1 <= k && i <= number1; i++) {
                if (((i * length1 + ((k - (i * length1)) / length2) * length2) == k) && (((k-i*length1) / length2) <= number2)) {
//                    result.add(one);
                    result++;
                }
            }

            System.out.println(result%1000000007);
        }
    }
}
