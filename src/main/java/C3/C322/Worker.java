package C3.C322;


import java.util.concurrent.TimeUnit;

public class Worker extends Thread{
    private UrgentTask joiner;

    public void setJoiner(UrgentTask joiner) {
        this.joiner = joiner;
    }

    public void run(){
        int i = 0;
        while(i < 9){
            try {
                if(i == 8){
                    UrgentTask urgent = joiner;
                    System.out.println("突然接收到紧急工作，需要去完成");
                    urgent.start();
                    urgent.join();
                }
                System.out.println("我正在做日程工作，完成度" + (i*10) + "%.....");
                TimeUnit.SECONDS.sleep(1);
                i += 2;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我已完成日程工作，完成度100%");
    }

}
