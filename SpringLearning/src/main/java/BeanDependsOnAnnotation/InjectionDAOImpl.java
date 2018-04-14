package BeanDependsOnAnnotation;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements BeanDependsOnAnnotation.InjectionDAO {

    @Override
    public void save(String s) {
        System.out.println("±£´æÊý¾Ý"+s);
    }
}
