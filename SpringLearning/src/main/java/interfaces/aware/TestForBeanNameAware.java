package interfaces.aware;

import org.springframework.beans.factory.BeanNameAware;

public class TestForBeanNameAware implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        System.out.println("beanName: "+s);
    }
}
