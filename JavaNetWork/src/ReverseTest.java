import java.net.InetAddress;
import java.net.UnknownHostException;

public class ReverseTest {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("104.77.25.82");
            System.out.println(ia.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
