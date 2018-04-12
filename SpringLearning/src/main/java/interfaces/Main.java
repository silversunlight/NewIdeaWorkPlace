package interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-bean.xml");
        OneInterface oneInterface = (OneInterface) context.getBean("OneInterface");
        System.out.println(oneInterface.hello("world"));
    }
}
