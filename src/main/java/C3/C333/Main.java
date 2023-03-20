package C3.C333;

public class Main {
    public static void main(String[] args) {
        StopTask task = new StopTask();
        Thread t =  new Thread(task);
        t.start();
        System.out.println("当前线程是否存活"+t.isAlive());
        try {
            Thread.sleep(1000);
            task.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程是否存活 "+t.isAlive());
        System.out.println("当前线程是否中断 "+t.isInterrupted());
    }
}
