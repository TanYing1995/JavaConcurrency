package C3.C322;

import java.util.concurrent.TimeUnit;

public class UrgentTask extends Thread{
    public void run(){
        int i = 0;
        while(i < 9){
            try {
                System.out.println("紧急任务完成度"+(i*10)+"%...");
                TimeUnit.SECONDS.sleep(1);
                i += 3;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("紧急工作完成度100%");
    }
}
