package interfaces.Injection;

public class InjectionDAOImpl implements InjectionDAO {

    @Override
    public void save(String s) {
        System.out.println("��������"+s);
    }
}
