import BeanDependsOnAnnotation.InjectionService;
import BeanDependsOnAnnotation.multiBean.BeanInvoker;
import org.junit.Test;

public class TestAutowiredAnnotation extends UnitTestBase {
    public TestAutowiredAnnotation() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testAutowired() {
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("This is autowired");
    }

    @Test
    public void testMultiBean() {
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
}
