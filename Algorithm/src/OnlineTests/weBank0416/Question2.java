package OnlineTests.weBank0416;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * �ڳ�������У�����ѧ��һ������������Ķ�������һ����СΪq���������ҽ���q
 * ��ĳ������p�ķ��ݣ���q=pk ,? �� 1������ͬ�������£���ͬ��С��������ֻ��һ����
 * ��Ϊ��ʱ������ѧ�����ߣ�����������������дһ������������ͬ�������µĲ�ͬ��
 * �������������һ������������?������Ҫ�����ж��ٸ���ͬ�������������ǵĴ�С
 * �ǲ�����n�ġ�
 * ����
 * ��һ�а���һ������?��1 �� ? �� 1000
 *
 * ���
 * �������������?��������ĸ�����
 */
public class Question2 {
    public static void getSushu(int n, ArrayList<Integer> a) {
        for(int i = 2; i < n; i++){
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                a.add(i);
            }
        }
    }

    public static void addArraylist(int n,ArrayList<Integer> a) {
        for (int i = 2;i<=10 ; i++) {
            for (int j=0;j<a.size();j++) {
                if (Math.pow(a.get(j), i) < 1000) {
                    a.add((int)Math.pow(a.get(j), i));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList a = new ArrayList<Integer>();
        getSushu(n,a);
        addArraylist(n, a);
        int count=0;
        for (int i = 2; i <= n; i++) {
            if (a.contains(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
