package crazyJava;

public class DrawTest {
    public static void main(String[] args) {
        Account account = new Account("tom", 1000);
        new DrawThread("��", account, 800).start();
        new DrawThread("��", account, 800).start();
    }
}
