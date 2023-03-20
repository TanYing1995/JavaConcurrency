package C1;

import java.util.concurrent.TimeUnit;

public class Task_1 {
    public static void main(String[] args) {
        Task t =  new Task();
        new Thread(t).start();
    }
}

class Task implements Runnable{

    public void run() {
        try{
            long bt = System.currentTimeMillis();
            System.out.println("任务开始.....");
            for(int i = 0; i < 10; i++){
                //TimeUnit.SECONDS.sleep(1);
                Thread.sleep(1000);
                System.out.println("数字： "+ i);
            }
            System.out.println("任务结束.....");
            long ed = System.currentTimeMillis();
            System.out.println("总共耗时： "+ (ed-bt)/1000 + "秒");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}