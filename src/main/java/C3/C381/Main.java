package C3.C381;

public class Main {
    public static void main(String[] args) {
        final Bank bank = new Bank();
        final Account a2 = new Account("123455666634");
        a2.setMoney(1000);
        final Account a3 = new Account("423523454334");
        a3.setMoney(1000);

        new Thread(new Runnable() {
            public void run() {
                bank.transferMoney(a2,a3,50);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                bank.transferMoney(a3,a2,100);
            }
        }).start();
    }
}
