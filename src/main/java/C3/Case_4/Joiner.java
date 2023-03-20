package C3.Case_4;

public class Joiner extends Thread{
    public void run(){
        System.out.println("Joiner 线程 id = " + Thread.currentThread().getId()+ " run...");
        try {
            for(int i = 0; i < 10;i++){
                Thread.sleep(1000);
                System.out.println("线程" + Thread.currentThread().getId() + " -----k-----"+i);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Joiner 线程 id = " + Thread.currentThread().getId()+ " end...");
    }
}
