import fly.FlyNoFly;
import quack.QuackNoQuack;

public class DuckRubber extends Duck {
    public DuckRubber() {
        super("Резиновая утка");
        setFly(new FlyNoFly());
        setQuackBehavior(new QuackNoQuack());
    }
}
