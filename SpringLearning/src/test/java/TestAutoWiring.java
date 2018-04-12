import interfaces.autoWiring.AutoWiringService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase{
    public TestAutoWiring() {
        super("classpath:spring-autowiring.xml");
    }
@Test
    public void testAutoWiring() {
    AutoWiringService service = super.getBean("autoWiringService");
    service.say("test");
    }
}
