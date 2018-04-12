import interfaces.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
    public TestInjection() {
        super("classpath:spring-bean.xml");
    }

    @Test
    public void testSetter() {
        InjectionService service = super.getBean("InjectionService");
        service.save("这是要保存的数据");
    }

}
