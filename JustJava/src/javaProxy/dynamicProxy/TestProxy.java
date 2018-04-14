package javaProxy.dynamicProxy;

public class TestProxy {
    public static void main(String[] args) {
        ProxyHandler proxyHandler=new ProxyHandler();
        Subject sub = (Subject) proxyHandler.bind(new RealSubject());
        sub.doSomething();
    }
}
