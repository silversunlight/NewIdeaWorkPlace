import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BinarySaver {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                URL root = new URL(args[i]);
                saveBianryFile(root);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void saveBianryFile(URL u) throws IOException {
        URLConnection uc = u.openConnection();
        String contentType = uc.getContentType();
        int contentLength = uc.getContentLength();
        if (contentType.startsWith("text/") || contentLength == -1) {
            throw new IOException("This is not binary file.");
        }
        try (InputStream raw = uc.getInputStream()) {
            InputStream in = new BufferedInputStream(raw);
            byte[] data = new byte[contentLength];
            int offset = 0;
            while (offset < contentLength) {
                int byteRead = in.read(data, offset, data.length - offset);
                if (byteRead == -1) break;
                offset += byteRead;
            }
            if (offset != contentLength) {
                throw new IOException("Only read " + offset + " bytes; " +
                        "Excepted " + contentLength + " bytes");
            }
            String filename=u.getFile();
            filename = filename.substring(filename.lastIndexOf('/') + 1);
            try (FileOutputStream fout = new FileOutputStream(filename)) {
                fout.write(data);
                fout.flush();
            }
        }
    }
}
