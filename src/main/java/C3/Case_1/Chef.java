package C3.Case_1;

public class Chef extends Thread{
    private Restaurant restaurant;
    private Waiter waiter;
    public Chef(Restaurant restaurant,Waiter waiter) {
        this.restaurant = restaurant;
        this.waiter = waiter;
    }

    public void run(){
        while(true){
            if(restaurant.order == null){
                restaurant.order = new Order();
                System.out.println("厨师-" + Thread.currentThread().getId() + " 接到新订单");
                synchronized(waiter){
                    System.out.println("厨师-" + Thread.currentThread().getId() + " 通知waiter取餐");
                    waiter.notify();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
