package C3.C333;

public class StopTask implements Runnable{
    private boolean flag = true;
    public void run() {
        int i = 0;
        while(flag){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            System.out.println(Thread.currentThread().getId()+ "==i==" + i);
        }
    }

    public void stop(){
        flag = false;
        System.out.println(Thread.currentThread().getId()+ "  发出停止指令！！！！");
    }
}
