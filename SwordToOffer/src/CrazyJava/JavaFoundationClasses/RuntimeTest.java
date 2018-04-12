package CrazyJava.JavaFoundationClasses;

public class RuntimeTest {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        System.out.println("cpu numbers: " + rt.availableProcessors());
        System.out.println("free mem numbers: " + rt.freeMemory());
        System.out.println("total mem numers: " + rt.totalMemory());
        System.out.println("usable men numbers: " + rt.maxMemory());
    }
}
