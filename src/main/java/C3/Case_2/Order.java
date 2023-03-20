package C3.Case_2;

import java.io.Serializable;

public class Order implements Serializable {
    private String dno;//订单号
    private String info;//订单内容

    public String getDno() {
        return dno;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Order(String dno) {
        this.dno = dno;
    }
}
