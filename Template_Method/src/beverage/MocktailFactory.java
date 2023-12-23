package beverage;

import addOn.AddOn;
import addOn.Chocolate;

public class MocktailFactory implements BeverageFactory{

    @Override
    public Beverage createBeverage() {
        return new Mocktail();
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
