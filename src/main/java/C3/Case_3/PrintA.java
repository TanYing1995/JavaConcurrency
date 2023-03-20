package C3.Case_3;

public class PrintA implements Runnable{
    private State state;

    public PrintA(State state) {
        this.state = state;
    }

    public void run() {
        while(true){
            try {
                synchronized (state){
                    if(state.bool){
                        state.wait();
                    }
                    System.out.println("aa...");
                    Thread.sleep(1000);
                    state.bool = true;
                    state.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
