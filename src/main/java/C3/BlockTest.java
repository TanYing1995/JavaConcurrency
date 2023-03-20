package C3;

public class BlockTest {
    public static void main(String[] args) {
        final Object o = new Object();
        new Thread(
                new Runnable() {
                    public void run() {
                        for(int i = 0; i < 10; i++){
                            System.out.println(Thread.currentThread().getId()+",i = "+ i);
                            if(i == 5){
                                synchronized (o){
                                    try{
                                        System.out.println(Thread.currentThread().getId()+" 开始等待。。。");
                                        o.wait();
                                    }
                                    catch (Exception e){e.printStackTrace();}
                                }
                            }
                        }
                    }
                }
        ).start();
        new Thread(
                new Runnable() {
                    public void run() {
                        System.out.println(Thread.currentThread().getId()+": Running.....");
                        try {
                            Thread.sleep(1000);
                            synchronized (o){
                                System.out.println(Thread.currentThread().getId() + " ,发送notify通知。。。");
                                o.notify();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        ).start();
    }
}
