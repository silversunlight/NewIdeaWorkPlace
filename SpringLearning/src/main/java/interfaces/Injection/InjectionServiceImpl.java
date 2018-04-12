package interfaces.Injection;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String s) {
        System.out.println("Service接收参数" + s);
        s = s + ":" +this.hashCode();
        injectionDAO.save(s);
    }
}
