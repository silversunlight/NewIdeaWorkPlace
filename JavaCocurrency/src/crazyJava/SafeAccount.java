package crazyJava;

public class SafeAccount {
    private String accountNo;
    private double balance;

    public SafeAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void draw(double drawAmount) {
        if (balance >= drawAmount) {
            System.out.println(Thread.currentThread().getName() +
                    "ȡǮ�ɹ����³���Ʊ�� " + drawAmount);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= drawAmount;
            System.out.println("\t ���Ϊ�� " + balance);
        } else {
            System.out.println("ȡǮʧ�ܣ����㣡 ");
        }
    }
}
