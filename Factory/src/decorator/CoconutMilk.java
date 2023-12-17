package decorator;

import drinks.Drink;

public class CoconutMilk extends Additive{

    public CoconutMilk(Drink drink) {
        super(drink);
        price = PriceList.coconutMilkPrice;
        description="Добавлено кокосовое молоко\n";
    }
}

