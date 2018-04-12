import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
    public TestAware() {
        super("classpath:spring-aware.xml");
    }
@Test
    public void testApplicationContextAware() {
    super.getBean("testForApplicationContextAware");
    }
@Test
    public void testBeanNameAware() {
    System.out.println("testBeanNameAware"+super.getBean("beanNameAware"));
    }
}
