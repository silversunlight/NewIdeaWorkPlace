package OnlineTests.kuaiShou0420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Question1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers=br.readLine().split(" ");
        BigInteger x = new BigInteger(numbers[0]);
        BigInteger y = new BigInteger(numbers[1]);
        BigInteger n = new BigInteger(numbers[2]);
        BigInteger result = x.modPow(y, n);
        System.out.println(result);
    }
}
