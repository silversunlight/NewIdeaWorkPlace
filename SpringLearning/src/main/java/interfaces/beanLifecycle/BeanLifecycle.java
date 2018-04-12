package interfaces.beanLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycle implements InitializingBean,DisposableBean {

    public void defaultInit() {
        System.out.println("default init");
    }

    public void defaultDestroy() {
        System.out.println("default destroy");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitialisingBean init");
    }
    public void start() {
        System.out.println("initMethod start");
    }

    public void stop() {
        System.out.println("destroyMethod start");
    }
}
