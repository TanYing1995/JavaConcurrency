package C3.C381;

public class Account {
    private String id;
    private double money;

    public Account(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money += money;
    }
}
