import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Huiwen {
    public int ReturnCount(int total, String[] strings) {
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                StringBuffer sb = new StringBuffer(strings[i]).append(strings[j]);
                StringBuffer temp = sb.reverse();
                if (sb.toString().equals(temp.toString())) count++;
            }
        }
        for (int i = strings.length - 1; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                StringBuffer sb = new StringBuffer(strings[i]).append(strings[j]);
                StringBuffer temp = sb.reverse();
                if (sb.toString().equals(temp.toString())) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = buf.readLine();
        String[] string = str.split(" ");
        int total = Integer.parseInt(string[0]);
        String[] strings=Arrays.copyOfRange(string,2,string.length);
        Huiwen h=new Huiwen();
        h.ReturnCount(total, strings);
    }
}
