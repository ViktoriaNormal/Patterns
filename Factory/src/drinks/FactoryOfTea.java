package drinks;

import base.Base;
import base.Water;
import mainIngredient.MainIngredient;
import mainIngredient.Tea;
import topping.WithoutTopping;
import topping.Topping;

public class FactoryOfTea extends FactoryOfDrink{

    @Override
    protected Base createBase() {
        return new Water();
    }

    @Override
    protected MainIngredient createMainIngredient() {
        return new Tea();
    }

    @Override
    protected Topping createTopping() {
        return new WithoutTopping();
    }

    @Override
    public Drink createDrink() {
        return new Drink(this) {
            @Override
            public String getName() {
                return "Чай";
            }
        };
    }
}