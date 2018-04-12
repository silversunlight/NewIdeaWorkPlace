import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class InstanceCallbackDigest implements Runnable {
    private String fileName;
    private InstanceCallbackDigestUserInterFace callback;

    public InstanceCallbackDigest(String fileName, InstanceCallbackDigestUserInterFace callback) {
        this.fileName = fileName;
        this.callback = callback;
    }

    @Override
    public void run() {
        FileInputStream in = null;
        try {
            in = new FileInputStream(fileName);
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            DigestInputStream din = new DigestInputStream(in, sha);
            while (din.read()!=-1);//读取整个文件
            din.close();
            byte[] digest=sha.digest();
            callback.receiveDigest(digest);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
