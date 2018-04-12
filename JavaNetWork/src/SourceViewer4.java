import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SourceViewer4 {
    public static void main(String[] args) {
        try{
            URL u = new URL(args[0]);
            HttpURLConnection uc=(HttpURLConnection)u.openConnection();
            try (InputStream raw = uc.getInputStream()) {
                printFromStream(raw);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printFromStream(InputStream raw) {
        try (InputStream buffer = new BufferedInputStream(raw)) {
            Reader reader = new InputStreamReader(buffer);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
