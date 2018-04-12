import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {
    public static ArrayList<Socket> socketArrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(30000);
        while (true) {
            Socket socket= serverSocket.accept();
            socketArrayList.add(socket);
            new Thread(new ServerThread(socket)).start();
        }
    }
}
