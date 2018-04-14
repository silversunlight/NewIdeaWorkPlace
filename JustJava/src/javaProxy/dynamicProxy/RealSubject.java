package javaProxy.dynamicProxy;

import javaProxy.staticProxy.Subject;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("call dosomething byRealSubject");
    }
}
