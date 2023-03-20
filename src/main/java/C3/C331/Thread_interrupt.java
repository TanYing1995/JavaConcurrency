package C3.C331;

public class Thread_interrupt {
    //中断运行态线程
    public static void main(String[] args) {
        final Object obj = new Object();
        Thread t = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10; i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("收到中断通知，结束线程。。。");
                        break;
                    }
                    else{
                        System.out.println(Thread.currentThread().getId()+", i= "+i);
                        try {
                            Thread.sleep(2000);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t.start();//启动线程
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
        System.out.println(t.getId()+ "  中断状态：" + t.isInterrupted());
    }
}
