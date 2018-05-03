package annotation;

public class Test {

    @MyTag(name = "xx", age = 6)
    public void info() {
        Class thisone=this.getClass();
        System.out.println(thisone);
    }

}
