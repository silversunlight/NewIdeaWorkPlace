import BeanDependsOnAnnotation.BeanAnnotation;
import org.junit.Test;

public class TestBeanAnnotation extends UnitTestBase {
    public TestBeanAnnotation() {
        super("classpath*:spring-beanannotation.xml");
    }
@Test
    public void testSay() {
    BeanAnnotation beanAnnotation = super.getBean("bean");
    beanAnnotation.say("this is test.");
    }
}
