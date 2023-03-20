package C3.Case_4;

public class Main {
    public static void main(String[] args) {
        Sleeper sleeper = new Sleeper();
        Joiner joiner = new Joiner();
        sleeper.setJoiner(joiner);
        sleeper.start();
        joiner.start();
    }
}
