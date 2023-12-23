package beverage;

import addOn.AddOn;
import addOn.Chocolate;

public class RafFactory implements BeverageFactory {

    @Override
    public Beverage createBeverage() {
        return new Raf();
    }

    @Override
    public FlavoringDecorator createFlavoringDecorator(Beverage beverage) {
        return new Soy(beverage);
    }

    @Override
    public AddOn createAddOn(Beverage beverage) {
        return new Chocolate(beverage);
    }
}
