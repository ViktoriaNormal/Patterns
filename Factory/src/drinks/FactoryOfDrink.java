package drinks;

import base.Base;
import mainIngredient.MainIngredient;
import topping.Topping;

public abstract class FactoryOfDrink {

    protected abstract Base createBase();

    protected abstract MainIngredient createMainIngredient();

    protected abstract Topping createTopping();

    public abstract Drink createDrink();
}