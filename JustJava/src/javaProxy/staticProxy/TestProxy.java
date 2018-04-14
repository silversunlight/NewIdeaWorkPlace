package javaProxy.staticProxy;

public class TestProxy {
    public static void main(String[] args) {
        Subject s=new SubjectProxy();
        s.doSomething();
    }
}
