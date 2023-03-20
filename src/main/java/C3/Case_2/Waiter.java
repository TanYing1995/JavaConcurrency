package C3.Case_2;

public class Waiter implements Runnable{
    private Order order;
    private Chef chef;
    private int msgID = 1;//新订单通知为1，取菜通知为2

    public void setMsgID(int msgID) {
        this.msgID = msgID;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }


    public void run() {
        while(true){
            synchronized (this){
                try {
                    System.out.println("....服务员空闲等待中....");
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(msgID == 1){
                //服务员收到新订单通知
                System.out.println("服务员收到订单： "+ this.order.getDno() + " , " + this.order.getInfo());
                //通知厨师做菜
                synchronized (chef){
                    System.out.println("通知厨师做菜");
                    chef.setOrder(order);
                    chef.notify();
                }
            }
            else{
                //服务员收到取餐通知
                System.out.println("服务员取餐给顾客。。。。");
            }
        }
    }
}
