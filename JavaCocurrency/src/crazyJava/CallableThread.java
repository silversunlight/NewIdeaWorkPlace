package crazyJava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread {
    public static void main(String[] args) {
        CallableThread ct=new CallableThread();
        FutureTask<Integer> task=new FutureTask<Integer>((Callable<Integer>)()->
        {
            int i=0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"  ��iֵΪ�� "+i);
            }
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " i��ֵ  " + i);
            if (i == 20) {
                new Thread(task, "�з���ֵ���߳�").start();
            }
        }
        try {
            System.out.println("���̵߳ķ���ֵ"+task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
