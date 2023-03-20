package C2;


public class SingleObject {
    private static SingleObject obj;
    //public Object;
    private SingleObject() {
    }

    public static SingleObject instance(){
        if(obj == null){
            obj = new SingleObject();
            System.out.println(Thread.currentThread().getId()+" 线程生成一个单例对象");
        }
        return obj;
    }

    public void dosomething(){}
}
