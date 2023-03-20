package C3.Case_3;

public class PrintB implements Runnable {
    private State state;

    public PrintB(State state) {
        this.state = state;
    }

    public void run() {
        while(true){
            try {
                synchronized (state){
                    if(!state.bool){
                        state.wait();
                    }
                    System.out.println("bb...");
                    state.bool = false;
                    state.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
