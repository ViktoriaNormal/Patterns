package beverage;

import addOn.AddOn;
import addOn.Chocolate;

public class EspressoFactory implements BeverageFactory{

    @Override
    public Beverage createBeverage() {
        return new Espresso();
    }

    @Override
    public FlavoringDecorator createFlavoringDecorator(Beverage beverage) {
        return new Milk(beverage);
    }

    @Override
    public AddOn createAddOn(Beverage beverage) {
        return new Chocolate(beverage);
    }
}
