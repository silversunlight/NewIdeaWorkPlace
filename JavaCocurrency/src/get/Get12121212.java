package get;

public class Get12121212 implements Runnable{
private int number;
public byte[] res;
public static int count=5;

    public Get12121212(int number, byte[] res) {
        this.number = number;
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (count-- > 0) {
                res.notify();
                System.out.println(" " + number);
                try {
                    res.wait();
                    System.out.println("-------"+Thread.currentThread().getName()
                    +"获得锁，wait()后的代码继续运行： "+number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return;
        }
    }
}

