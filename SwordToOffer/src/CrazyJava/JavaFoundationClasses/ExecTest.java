package CrazyJava.JavaFoundationClasses;

import java.io.IOException;

public class ExecTest {
    public static void main(String[] args) throws IOException {
        Runtime rt=Runtime.getRuntime();
        rt.exec("notepad.exe");
    }
}
