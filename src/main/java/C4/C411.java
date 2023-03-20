package C4;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class C411 {
    public static void main(String[] args) {
        BlockingQueue<Runnable> bq = new LinkedBlockingDeque<Runnable>(5);
        ThreadPoolExecutor pool = new
                ThreadPoolExecutor(3,8,2000, TimeUnit.MILLISECONDS,bq);
        for(int i = 0; i < 13; i++){
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getId()+ " is Running...");
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        System.out.println("池中线程数：" + pool.getPoolSize());
        List<Runnable> undo = pool.shutdownNow();
        System.out.println("未执行的任务：" + undo.size());

    }
}
