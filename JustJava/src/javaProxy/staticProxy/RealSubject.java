package javaProxy.staticProxy;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("call dosomething byRealSubject");
    }
}
