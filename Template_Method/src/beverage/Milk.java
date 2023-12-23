package beverage;

public class Milk extends FlavoringDecorator{

    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Молоко";
    }

    public int cost() {
        return beverage.cost() + 40;
    }
}
