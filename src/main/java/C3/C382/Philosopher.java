package C3.C382;

public class Philosopher extends Thread{
    private static int counter = 0;
    private int number = counter++;
    private ChopStick left;
    private ChopStick right;
    public Philosopher(ChopStick left,ChopStick right){
        this.left = left;
        this.right = right;
        start();
    }

    public void think(){
        try {
            sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eat(){
        synchronized (left){
            System.out.println(Thread.currentThread().getId()+"持有"+left+" 等待 " + right);
            synchronized (right){
                System.out.println(this+"---吃菜---");
            }
        }
    }

    public String toString(){
        return "哲学家： "+number;
    }

    public void run(){
        while(true){
            think();
            eat();
        }
    }
}
