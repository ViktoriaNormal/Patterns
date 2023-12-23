package beverage;

public class Whip extends FlavoringDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Взбитые сливки";
    }

    public int cost() {
        return beverage.cost() + 50;
    }
}
