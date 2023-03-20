package C3.Case_2;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        waiter.setChef(chef);
        chef.setWaiter(waiter);
        Restaurant restaurant = new Restaurant();
        restaurant.setWaiter(waiter);
        new Thread(waiter).start();
        new Thread(chef).start();
        new Thread(restaurant).start();
    }
}
