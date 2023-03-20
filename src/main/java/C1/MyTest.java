package C1;

public class MyTest {
    public static void main(String[] args) {
        //创建任务
        MyRunnable mr = new MyRunnable();
        //启动线程，申请执行任务
        new Thread(mr).start();
    }

}

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("我的任务开始执行...");
    }
}
