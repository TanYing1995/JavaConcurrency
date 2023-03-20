package C3.C382;

public class Main {
    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[10];
        ChopStick left,right,first;
        left = new ChopStick();
        right = new ChopStick();
        first = left;
        for(int i = 0; i < 4; i++){
            philosophers[i] = new Philosopher(left,right);
            left = right;
            right = new ChopStick();
        }
        philosophers[4] = new Philosopher(left,first);//死锁
        //philosophers[4] = new Philosopher(first,left);//不死锁
    }
}
