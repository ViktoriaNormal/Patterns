package beverage;

import addOn.AddOn;
import addOn.Chocolate;

public class TeaFactory implements BeverageFactory{

    @Override
    public Beverage createBeverage() {
        return new Tea();
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
