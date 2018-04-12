package Tencent;

import java.math.BigDecimal;
import java.util.Scanner;

public class Quesiont1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        BigDecimal n = new BigDecimal(s1);
        BigDecimal n2 = new BigDecimal(s2);
        BigDecimal n3 = n.multiply(n2);
        BigDecimal result = n3.divide(new BigDecimal(2));
        System.out.println(result);
    }
}
