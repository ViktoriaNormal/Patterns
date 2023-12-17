package decorator;

import drinks.Drink;

public class Milk extends Additive{

    public Milk(Drink drink) {
        super(drink);
        price = PriceList.milkPrice;
        description ="Добавлено коровье молоко\n";
    }
}
