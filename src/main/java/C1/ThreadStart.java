package C1;

public class ThreadStart {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("thread running........");
    }
}
