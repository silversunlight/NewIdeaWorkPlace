package crazyJava;

public class DrawThread extends Thread {
    private Account account;
    //要取的钱数
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
                System.out.println(getName() + "取钱成功！ 吐出钞票： " + drawAmount);
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("\t 余额为： " + account.getBalance());
            } else {
                System.out.println(getName() + " 取钱失败，余额不足。");
            }
        }
    }
}
