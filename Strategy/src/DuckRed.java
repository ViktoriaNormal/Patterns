import fly.FlyOnWings;
import quack.QuackNoQuack;

public class DuckRed extends Duck {

    public DuckRed() {
        super("Красноголовая утка");
        setFly(new FlyOnWings());
        setQuackBehavior(new QuackNoQuack());
    }
}
