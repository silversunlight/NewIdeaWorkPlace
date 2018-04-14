package BeanDependsOnAnnotation;

/**
 * @component×¢½â
 */

import org.springframework.stereotype.Component;

@Component("bean")
public class BeanAnnotation {
    public void say(String word) {
        System.out.println("BeanAnnotation: "+word);
    }
}
