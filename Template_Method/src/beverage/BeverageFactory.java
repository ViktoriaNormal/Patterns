package beverage;

import addOn.AddOn;

public interface BeverageFactory {

    Beverage createBeverage();

    FlavoringDecorator createFlavoringDecorator(Beverage beverage);

    AddOn createAddOn(Beverage beverage);
}
