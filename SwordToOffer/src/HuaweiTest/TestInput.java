package HuaweiTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(s);
        String s1=s.trim();
        System.out.println(s1);
    }
}
