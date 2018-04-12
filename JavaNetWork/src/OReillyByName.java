import sun.plugin2.util.NativeLibLoader;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class OReillyByName {
    public static void main(String[] args) {
        InetAddress address = null;

        try {
            address = InetAddress.getByName("www.oreilly.com");
            InetAddress[] addresses = InetAddress.getAllByName("www.oreilly.com");
            for (InetAddress ad :
                   addresses ) {
                System.out.println(ad  );
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(address);

    }
}
