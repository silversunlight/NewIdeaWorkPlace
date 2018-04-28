package OnlineTests.weBank0416;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 在抽象代数中，我们学过一个关于有限域的定理：存在一个大小为q的有限域当且仅当q
 * 是某个素数p的方幂，即q=pk ,? ≥ 1，且在同构意义下，相同大小的有限域只有一个。
 * 作为新时代的数学工作者，你决定运用这个定理写一个程序来计算同构意义下的不同有
 * 限域个数。对于一个给定的输入?，你需要计算有多少个不同构的有限域，它们的大小
 * 是不超过n的。
 * 输入
 * 第一行包含一个整数?。1 ≤ ? ≤ 1000
 *
 * 输出
 * 输出阶数不超过?的有限域的个数。
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
