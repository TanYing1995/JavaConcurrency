package C3.C322;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try {
            Worker worker = new Worker();
            UrgentTask urgentTask = new UrgentTask();
            worker.start();
            TimeUnit.SECONDS.sleep(3);
            worker.setJoiner(urgentTask);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
