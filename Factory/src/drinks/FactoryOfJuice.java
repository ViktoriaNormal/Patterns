package drinks;

import base.Base;
import base.Juice;
import mainIngredient.Fruits;
import mainIngredient.MainIngredient;
import topping.Alco;
import topping.Topping;

public class FactoryOfJuice extends FactoryOfDrink {

    @Override
    protected Base createBase() {
        return new Juice();
    }

    @Override
    protected MainIngredient createMainIngredient() {
        return new Fruits();
    }

    @Override
    protected Topping createTopping() {
        return new Alco();
    }

    @Override
    public Drink createDrink() {
        return new Drink(this) {
            @Override
            public String getName() {
                return "Фруктовый напиток";
            }
        };
    }
}
