package Tencent;

import java.util.Scanner;

//����һ���ַ���s������Դ���ɾ��һЩ�ַ���ʹ��ʣ�µĴ���һ�����Ĵ������ɾ������ʹ�û��Ĵ���أ�
//�����Ҫɾ�����ַ�������
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
