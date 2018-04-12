import interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
    public TestOneInterface() {
        super("classpath*:spring-bean.xml");
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("OneInterface");
        System.out.println(oneInterface.hello("my input"));
    }
}
