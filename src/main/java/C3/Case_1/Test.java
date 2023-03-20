package C3.Case_1;

public class Test {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Waiter waiter = new Waiter(restaurant);
        waiter.start();
        Chef chef = new Chef(restaurant,waiter);
        chef.start();
    }
}
