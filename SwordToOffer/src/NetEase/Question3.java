package NetEase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeMap;

public class Question3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.charAt(0);
        int m = s.charAt(2);
        TreeMap<Integer, Integer> work = new TreeMap<>();
        for (int i=0;i<n;i++) {
            work.put((int)s.charAt(4 + 4 * i), (int)s.charAt(6 + 4 * i));
        }
        int[] ability = new int[m];
        for (int i=0;i<m;i++) {
            ability[i] = s.charAt(4 + 4 * n + 2*i);
        }
        Set<Integer> set=work.keySet();
        int salary=0;
        for (int i=0;i<m;i++) {
            for (int j : set) {
                if (ability[i] > j) {
                    System.out.println(salary);
                }
                salary = work.get(j);
            }
        }
    }
}
