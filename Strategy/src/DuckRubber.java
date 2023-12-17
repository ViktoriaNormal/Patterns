import fly.FlyNoFly;
import quack.QuackNoQuack;

public class DuckRubber extends Duck {
    public DuckRubber() {
        super("Резиновая утка");
        setFlyBehavior(new FlyNoFly());
        setQuackBehavior(new QuackNoQuack());
    }
}
