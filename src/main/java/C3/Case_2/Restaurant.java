package C3.Case_2;

import java.util.Random;

public class Restaurant implements Runnable{
    private Waiter waiter;

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void run() {
        while(true){
            int rand = new Random().nextInt(3000);
            try {
                System.out.println("饭店等待顾客中.......");
                Thread.sleep(rand);
                String dno = "d" + System.currentTimeMillis();
                Order order = new Order(dno);
                order.setInfo("宫保鸡丁一份");
                System.out.println("顾客来了，通知服务员点菜，生成订单：" + dno);
                synchronized (waiter){
                    waiter.setOrder(order);
                    waiter.setMsgID(1);
                    waiter.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
