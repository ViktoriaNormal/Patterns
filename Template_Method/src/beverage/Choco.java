package beverage;

public class Choco extends FlavoringDecorator{

    Beverage beverage;
    public Choco(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Шоколад";
    }

    public int cost() {
        return beverage.cost() + 50;
    }
}
