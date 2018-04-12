import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("out.text");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 1024);
        PrintStream printStream = new PrintStream(bufferedOutputStream, false);
        System.setOut(printStream);
        System.out.println("this is a test\u4321");
        int n=37;
        System.out.println("the square of" + n + "is" + (n * n));
        printStream.close();
    }
}
