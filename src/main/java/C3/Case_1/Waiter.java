package C3.Case_1;

public class Waiter extends Thread{
    private Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run(){
        while(restaurant.order == null){
            synchronized (this){
                try {
                    System.out.println("服务员-"+Thread.currentThread().getId()+"  等待中...");
                    wait();
                    restaurant.order = null;
                    System.out.println("服务员-"+Thread.currentThread().getId()+" 收到通知，取走订单");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
