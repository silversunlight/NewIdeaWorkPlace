import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketInfo {
    public static void main(String[] args) {
        for (String host : args) {
            try {
                Socket theSocket = new Socket(host, 80);
                System.out.println("Connected to "+theSocket.getInetAddress()+
                " on port "+theSocket.getPort()+" from port"
                +theSocket.getLocalPort()+" of "
                +theSocket.getLocalAddress());
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
