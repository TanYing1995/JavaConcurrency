package C3.C381;

public class Bank {
//    public void transferMoney(Account from,Account to,double money){
//        try {
//            synchronized (from){
//                    Thread.sleep(1000);
//                    if(from.getMoney()-money < 0){
//                        System.out.println("余额不足，转账失败");
//                    }
//                    from.setMoney(-money);
//                    synchronized (to){
//                        to.setMoney(money);
//                    }
//                    System.out.println(from.getId()+"转账成功，"+to.getId() + "收到金额" + money + "元");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void transferMoney(Account from,Account to,double money){
        try {
            int res = from.getId().compareTo(to.getId());
            if(res > 0){
                synchronized (from){
                    Thread.sleep(1000);
                    from.setMoney(-money);
                    synchronized (to){
                        to.setMoney(money);
                    }
                    System.out.println(from.getId()+"转账成功，"+to.getId() + "收到金额" + money + "元");
                }
            }
            else{
                synchronized (to){
                    Thread.sleep(1000);
                    to.setMoney(-money);
                    synchronized (from){
                        from.setMoney(money);
                    }
                    System.out.println(from.getId()+"转账成功，"+to.getId() + "收到金额" + money + "元");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
