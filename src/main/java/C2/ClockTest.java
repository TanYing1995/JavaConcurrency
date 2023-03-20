package C2;

public class ClockTest {
    public static void main(String[] args) {
        final Clock clock = new Clock(10);
        for(int i = 0; i < 2; i++){
            new Thread(
                    new Runnable() {
                        public void run() {
                            clock.timeout();
                        }
                    }
            ).start();
            new Thread(
                    new Runnable() {
                        public void run() {
                            clock.time();
                        }
                    }
            ).start();
        }
    }
}
