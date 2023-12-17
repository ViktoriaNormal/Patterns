import fly.FlyOnWings;
import quack.QuackNoQuack;

public class DuckRed extends Duck {

    public DuckRed() {
        super("Красноголовая утка");
        setFlyBehavior(new FlyOnWings());
        setQuackBehavior(new QuackNoQuack());
    }
}
