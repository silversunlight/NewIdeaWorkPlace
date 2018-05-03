package annotation;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Annotation[] arrays = Class.forName("annotation.Test").getMethod("info").getAnnotations();
        for (Annotation an : arrays) {
            System.out.println(an);
        }
    }
}
