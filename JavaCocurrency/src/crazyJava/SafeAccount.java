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
                    "取钱成功！吐出钞票： " + drawAmount);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= drawAmount;
            System.out.println("\t 余额为： " + balance);
        } else {
            System.out.println("取钱失败！余额不足！ ");
        }
    }
}
