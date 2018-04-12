package HuaweiTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShoppingList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = s.charAt(0);
        int m = s.charAt(2);


    }

    class commodity {
        int v;
        int p;
        int q;

        public commodity(int v, int p, int q) {
            this.v = v;
            this.p = p;
            this.q = q;
        }
    }
}
