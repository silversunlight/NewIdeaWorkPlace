package javaProxy.staticProxy;

public class SubjectProxy implements Subject {
    Subject subject=new RealSubject();
    @Override
    public void doSomething() {
        System.out.println("call by subjectProxy");
        subject.doSomething();
    }
}
