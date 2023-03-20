package C3.Case_1;

public class Order {
    private static int i = 0;
    private int m_count;
    public Order(){
        m_count = i++;
        if(m_count == 10){
            System.out.println("食物售罄，结束");
            System.exit(0);
        }
    }
}
