package addOn;

import beverage.Beverage;

public abstract class AddOn {

    protected Beverage beverage;
    public abstract String getDescription();
    public abstract double cost();
}
