public class Test {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        System.out.println("a的地址 "+System.identityHashCode(a));
        StringBuffer b = new StringBuffer("B");
        System.out.println("b的地址 "+System.identityHashCode(b));
        operate(a, b);
        System.out.println("a的地址" + System.identityHashCode(a));
        System.out.println("b的地址" + System.identityHashCode(b));
    }

    private static void operate(StringBuffer x, StringBuffer y) {
        System.out.println("x的地址 "+System.identityHashCode(x));
        System.out.println("y的地址 "+System.identityHashCode(y));
        x.append(y);
        System.out.println("x的地址 "+System.identityHashCode(x));
        y=x;
        System.out.println("y的地址 "+System.identityHashCode(y));
    }
}
