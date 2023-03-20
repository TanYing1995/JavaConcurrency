package C3.Case_3;

public class Main {
    public static void main(String[] args) {
        State state = new State();
        new Thread(new PrintA(state)).start();
        new Thread(new PrintB(state)).start();
    }
}
