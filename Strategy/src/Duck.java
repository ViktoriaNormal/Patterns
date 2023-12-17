import fly.FlyBehavior;
import fly.FlyNoFly;
import quack.QuackBehavior;
import quack.QuackNoQuack;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected String typeName;

    public Duck(String typeName) {
        this.typeName = typeName;
        flyBehavior = new FlyNoFly();
        quackBehavior = new QuackNoQuack();
    }

    protected void setFlyBehavior(FlyBehavior flyType) {
        flyBehavior = flyType;
    }

    protected void setQuackBehavior(QuackBehavior quackType) {
        quackBehavior = quackType;
    }

    protected void display() {
        System.out.println(typeName);
        quackBehavior.quack();
        flyBehavior.fly();
        System.out.println();
    }
}
