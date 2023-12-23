package addOn;

import beverage.Beverage;

public class Chocolate extends AddOn{

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Шоколад";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
