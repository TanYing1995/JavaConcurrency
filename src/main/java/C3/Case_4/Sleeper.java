package C3.Case_4;

public class Sleeper extends Thread{
    private Joiner joiner;

    public void setJoiner(Joiner joiner) {
        this.joiner = joiner;
    }

    public void run(){
        System.out.println("Sleeper 线程 id = " + Thread.currentThread().getId()+ " run...");
        try {
            for(int i = 0; i < 10 ; i++){
                    if(i == 5 && joiner != null){
                        System.out.println("joiner 加入，线程" + Thread.currentThread().getId() + " 被阻塞" );
                        joiner.join();
                    }
                    Thread.sleep(1000);
                    System.out.println("线程" + Thread.currentThread().getId() + " -----i-----"+i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleeper 线程 id = " + Thread.currentThread().getId()+ " end...");
    }
}
