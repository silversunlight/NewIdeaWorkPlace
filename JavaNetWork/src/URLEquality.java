import java.net.MalformedURLException;
import java.net.URL;

public class URLEquality {
    public static void main(String[] args) {
        try {
            URL www = new URL("http://www.ibiblio.org/");
            URL ibiblio = new URL("http://ibiblio.org/");
            if (ibiblio.equals(www)) {
                System.out.println("the same");
            } else {
                System.out.println("not the same");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
