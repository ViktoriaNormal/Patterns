package drinks;

import base.Base;
import base.Water;
import mainIngredient.Coffee;
import mainIngredient.MainIngredient;
import topping.Syrup;
import topping.Topping;

public class FactoryOfCoffee extends FactoryOfDrink {

    @Override
    protected Base createBase() {
        return new Water();
    }

    @Override
    protected MainIngredient createMainIngredient() {
        return new Coffee();
    }

    @Override
    protected Topping createTopping() {
        return new Syrup();
    }

    @Override
    public Drink createDrink() {
        return new Drink(FactoryOfCoffee.this) {
            @Override
            public String getName() {
                return "Кофе";
            }
        };
    }
}
