import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FormPoster {
    private URL url;
    private QueryString query = new QueryString();

    public FormPoster(URL url) {
        if (!url.getProtocol().toLowerCase().startsWith("http")) {
            throw new IllegalArgumentException("Posting only works for the URLs");
        }
        this.url=url;
    }

    public void add(String name, String value) {
        query.add(name,value);
    }

    public URL getUrl() {
        return url;
    }
    public InputStream post() throws IOException {
        URLConnection uc=url.openConnection();
        uc.setDoOutput(true);
        try (OutputStreamWriter out =
                     new OutputStreamWriter(uc.getOutputStream(), "UTF-8")) {
            out.write(query.toString());
            out.write("\r\n");
            out.flush();
        }
        return uc.getInputStream();
    }

    public static void main(String[] args) {
        URL url;
        if (args.length > 0) {
            try {
                url = new URL(args[0]);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return;
            }
        } else {
            try {
                url = new URL("http://ww.cafeaulait.org/books/jnp4/postquery.phtml");
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return;
            }
        }
        FormPoster poster = new FormPoster(url);
        poster.add("name", "Elliotte Rusty Harold");
        poster.add("email", "elharo@ibiblio.org");

        try (InputStream in = poster.post()) {
            Reader r = new InputStreamReader(in);
            int c;
            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
