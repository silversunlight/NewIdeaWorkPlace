package OnlineTests.kuaiShou0420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int x=br.read();
        int[] a = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            a[i] = Integer.parseInt(s1[i]);
        }
        int p=1;
        if (Arrays.asList(a).contains(x)) {
            System.out.println(Arrays.asList(a).indexOf(x));
        } else if (a[a.length - 1] < x) {
            System.out.println(a.length);
        } else {
            while (true) {
                if (Arrays.asList(a).contains(p++)) {
                    System.out.println(Arrays.asList(a).indexOf((x+p)));
                    break;
                }
            }
        }
    }
}
