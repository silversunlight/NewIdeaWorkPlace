package BeanDependsOnAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {
    @Qualifier("injectionDAOImpl")
    @Autowired
    private InjectionDAO injectionDAO;



    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String s) {
        System.out.println("Service接收参数" + s);
        s = s + ":" + this.hashCode();
        injectionDAO.save(s);
    }
}
