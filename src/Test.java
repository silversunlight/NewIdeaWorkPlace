public class Test {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        System.out.println("a�ĵ�ַ "+System.identityHashCode(a));
        StringBuffer b = new StringBuffer("B");
        System.out.println("b�ĵ�ַ "+System.identityHashCode(b));
        operate(a, b);
        System.out.println("a�ĵ�ַ" + System.identityHashCode(a));
        System.out.println("b�ĵ�ַ" + System.identityHashCode(b));
    }

    private static void operate(StringBuffer x, StringBuffer y) {
        System.out.println("x�ĵ�ַ "+System.identityHashCode(x));
        System.out.println("y�ĵ�ַ "+System.identityHashCode(y));
        x.append(y);
        System.out.println("x�ĵ�ַ "+System.identityHashCode(x));
        y=x;
        System.out.println("y�ĵ�ַ "+System.identityHashCode(y));
    }
}
