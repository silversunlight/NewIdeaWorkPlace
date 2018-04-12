import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyAddress {
    public static void main(String[] args) {
        InetAddress address;
        {
            try {
                address = InetAddress.getLocalHost();
                String dottedQuad=address.getHostAddress();
                System.out.println(address+" "+dottedQuad);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }

    }
}
