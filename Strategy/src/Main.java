import fly.FlyOnWings;
import fly.FlyRocket;
import quack.QuackLoad;
import quack.QuackLong;

public class Main {
    public static void main(String[] args) {

        DuckSaxon duckSaxon = new DuckSaxon();
        duckSaxon.display();
        duckSaxon.setFly(new FlyOnWings());
        duckSaxon.display();

        DuckRubber duckRubber = new DuckRubber();
        duckRubber.display();
        duckRubber.setQuackBehavior(new QuackLong());
        duckRubber.display();

        DecoyDuck duckDecoy = new DecoyDuck();
        duckDecoy.display();
        duckDecoy.setFly(new FlyRocket());
        duckDecoy.display();

        DuckRed duckRed = new DuckRed();
        duckRed.display();
        duckRed.setQuackBehavior(new QuackLoad());
        duckRed.display();
    }
}