package decorator;

import drinks.Drink;

public class SoyMilk extends Additive{

    public SoyMilk(Drink drink) {
        super(drink);
        price = PriceList.soyMilkPrice;
        description = "Добавлено соевое молоко\n";
    }
}
