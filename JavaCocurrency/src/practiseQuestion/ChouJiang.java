package practiseQuestion;

//��һ���齱��,�ó齱���д���˽����Ľ��,�ó齱����һ������
// int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
//���������齱��(�߳�)�����߳����Ʒֱ�Ϊ���齱��1�������齱��2����
// �����arr�����л�ȡ����Ԫ�ز���ӡ�ڿ���̨��
public class ChouJiang implements Runnable {

    int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
    int num = arr.length;
    boolean[] flag = new boolean[arr.length];

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num > 0) {
                    int index = (int) (Math.random() * arr.length);
                    int get = arr[index];

                    if (flag[index] != true) {
                        flag[index]=true;
                        System.out.println(Thread.currentThread().getName()
                                + " �ֲ�����һ��" + get + " Ԫ�󽱡�");
                        num--;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ChouJiang c=new ChouJiang();
        Thread t1 = new Thread(c, "�齱��1");
        Thread t2 = new Thread(c, "�齱��2");
        t1.start();
        t2.start();
    }
}
