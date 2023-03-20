package C3.Case_2;

import java.util.Random;

public class Chef implements Runnable{
    private Order order;
    private Waiter waiter;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }


    public void run() {
        while(true){
            synchronized (this){
                try {
                    System.out.println("厨师空闲等待中。。。。");
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //厨师收到订单
            int rand = new Random().nextInt(1000);
            try {
                Thread.sleep(rand);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("厨师做菜完成，通知服务员取餐。。。");
            synchronized (this.waiter){
                waiter.setMsgID(2);
                waiter.notify();
            }
        }
    }
}
