package beverage;

public class Soy extends FlavoringDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Соя";
    }

    public int cost() {
        return beverage.cost() + 45;
    }
}
