package beverage;

import addOn.AddOn;
import addOn.Chocolate;

public class CappuccinoFactory implements BeverageFactory{

    @Override
    public Beverage createBeverage() {
        return new Cappuccino();
    }

    @Override
    public FlavoringDecorator createFlavoringDecorator(Beverage beverage) {
        return new Whip(beverage);
    }

    @Override
    public AddOn createAddOn(Beverage beverage) {
        return new Chocolate(beverage);
    }
}
