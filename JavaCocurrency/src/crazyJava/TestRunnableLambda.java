package crazyJava;

public class TestRunnableLambda {
    public void testRunnable(int i,Runnable runnable) {
            runnable.run();
    }
    public static void main(String[] args) {
        int i=10;
        TestRunnableLambda t1 = new TestRunnableLambda();
        t1.testRunnable(i,()-> System.out.println(i));
    }
}
