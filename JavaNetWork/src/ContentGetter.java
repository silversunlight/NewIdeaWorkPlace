import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ContentGetter {
    public static void main(String[] args) {
        try {
            URL u = new URL(args[0]);
            Object o=u.getContent();
            System.out.println("I got a"+o.getClass().getName());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
