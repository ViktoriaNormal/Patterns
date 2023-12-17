package decorator;

import drinks.Drink;

public class Chocolate extends Additive{

    public Chocolate(Drink drink) {
        super(drink);
        price = PriceList.chocolatePrice;
        description ="Добавлен шоколад\n";
    }
}

