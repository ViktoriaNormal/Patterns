import fly.FlyThrow;
import quack.QuackLoad;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super("Утка-приманка");
        setFlyBehavior(new FlyThrow());
        setQuackBehavior(new QuackLoad());
    }
}
