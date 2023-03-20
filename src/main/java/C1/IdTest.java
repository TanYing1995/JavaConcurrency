package C1;

public class IdTest {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            MyRunnable mr = new MyRunnable();
            Thread th = new Thread(mr);
            th.start();
            System.out.println(th.getId());
            System.out.println(th.getName());
        }
    }
}
