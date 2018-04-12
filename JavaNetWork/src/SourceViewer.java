import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SourceViewer {
    public static void main(String[] args) {
        if (args.length > 0) {
            InputStream in=null;
            try {
                URL u = new URL(args[0]);
                in=u.openStream();
                in = new BufferedInputStream(in);
                Reader r = new InputStreamReader(in);
                int c;
                while ((c = r.read()) != -1) {
                    System.out.print   ((char)c);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
