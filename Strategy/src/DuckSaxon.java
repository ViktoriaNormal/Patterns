import fly.FlyOnWings;
import quack.QuackRarely;

public class DuckSaxon extends Duck {
    public DuckSaxon() {
        super("Саксонская утка");
        setFly(new FlyOnWings());
        setQuackBehavior(new QuackRarely());
    }
}
