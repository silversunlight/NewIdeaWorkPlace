import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class WebLog {
    public static void main(String[] args) {
        try (
                FileInputStream fin = new FileInputStream(args[0]);
                Reader in = new InputStreamReader(fin);
                BufferedReader bin = new BufferedReader(in);) {

           for(String entry=bin.readLine();
                   entry!=null;
                   entry=bin.readLine()) {
               int index = entry.indexOf(' ');
               String ip = entry.substring(0, index);
               String theRest = entry.substring(index);

               try {
                   InetAddress address = InetAddress.getByName(ip);
                   System.out.println(address.getHostName() + theRest);
               } catch (UnknownHostException ex) {
                   System.err.println(entry);
               }
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
