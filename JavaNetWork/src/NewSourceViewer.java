import java.io.*;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;

public class NewSourceViewer {
    public static void main(String[] args) {
        Authenticator.setDefault(new DialogAuthenticator());
        for (int i = 0; i < args.length; i++) {
            try {
                URL u = new URL(args[0]);
                try(InputStream in=new BufferedInputStream(u.openStream())) {
                    Reader r = new InputStreamReader(in);
                    int c;
                    while ((c = r.read()) != -1) {
                        System.out.println((char) c);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        System.exit(0);
    }
}
