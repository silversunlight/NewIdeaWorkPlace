package crazyJava;

public class DrawThread extends Thread {
    private Account account;
    //Ҫȡ��Ǯ��
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        synchronized (account) {
            if (account.getBalance() >= drawAmount) {
                System.out.println(getName() + "ȡǮ�ɹ��� �³���Ʊ�� " + drawAmount);
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("\t ���Ϊ�� " + account.getBalance());
            } else {
                System.out.println(getName() + " ȡǮʧ�ܣ����㡣");
            }
        }
    }
}
