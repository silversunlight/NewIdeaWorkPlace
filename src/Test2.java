import java.util.ArrayList;
import java.util.List;

public class Test2  {
    private List names = new ArrayList();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void printAll() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        final Test2 t1=new Test2();
        for (int i = 0; i < 2; i++) {
            new Thread(){
                @Override
                public void run() {
                    t1.add("A");
                    t1.add("B");
                    t1.add("C");
                    t1.printAll();
                }
            }.start();
        }
    }
}


