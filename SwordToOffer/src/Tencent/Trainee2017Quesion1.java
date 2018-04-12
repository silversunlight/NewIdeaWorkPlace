package Tencent;

import java.util.Scanner;

//给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
//输出需要删除的字符个数。
public class Trainee2017Quesion1 {
    public static int numberToDelete(String s) {
        int number=0;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != sb2.charAt(i)) {
                number++;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String v=s.trim();
        System.out.println(numberToDelete(v));
    }
}
