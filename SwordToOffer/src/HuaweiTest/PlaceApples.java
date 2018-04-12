package HuaweiTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * m个苹果放到n个盘子里，有多少种方法
 */
public class PlaceApples {
    public static int count(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return count(m, n - 1) + count(m - n, n);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M=br.read();
        int N=br.read();
        br.close();
        if (M < 1 || N > 10) {
            System.out.println(-1);
        } else {
            System.out.println(count(M,N));
        }

    }
}
