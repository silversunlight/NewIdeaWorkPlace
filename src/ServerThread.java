import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Iterator;

public class ServerThread implements Runnable {
    Socket socket = null;
    BufferedReader bufferedReader = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String content = null;
        while ((content = readFromClient()) != null) {
            for(Iterator<Socket> it=MyServer.socketArrayList.iterator();it.hasNext();) {
                Socket socket=it.next();
                try {
                    OutputStream outputStream=socket.getOutputStream();
                    outputStream.write((content+"\n").getBytes("utf-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                    it.remove();
                    System.out.println(MyServer.socketArrayList);
                }
            }
        }
    }

    private String readFromClient() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            MyServer.socketArrayList.remove(socket);
        }
        return null;
    }
}
