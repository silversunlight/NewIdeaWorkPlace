public class Test2 extends Vechicle {
    public static void main(String[] args) {
        new Test2().run();
    }

    private final void run() {
        System.out.println("car");
    }
}

class Vechicle {
    private final void run() {
        System.out.println("vehicle");
    }
}
