import fly.FlyThrow;
import quack.QuackLoad;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super("Утка-приманка");
        setFly(new FlyThrow());
        setQuackBehavior(new QuackLoad());
    }
}
