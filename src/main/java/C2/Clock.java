package C2;

public class Clock {

    private int beginer;

    public Clock(int beginer) {
        this.beginer = beginer;
    }

    public synchronized void time(){
        System.out.println(Thread.currentThread().getId() + "进入。。。");
        int end = this.beginer;
        while(end-beginer < 10){
            System.out.println(Thread.currentThread().getId() + " 正计时：" + end);
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
            }
            end++;
        }
    }

    public synchronized void timeout(){
        System.out.println(Thread.currentThread().getId() + "进入。。。");
        while(this.beginer > 0){
            beginer--;
            System.out.println(Thread.currentThread().getId() + " 倒计时：" + beginer);
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
            }
        }
    }
}
