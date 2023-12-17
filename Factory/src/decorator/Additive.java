package decorator;

import drinks.Drink;

public class Additive extends Drink {

    Drink drink;
    protected int price = 0;
    protected String description = "";

    public Additive(Drink drink){
        this.drink = drink;
    }

    @Override
    public String getName() {
        return drink.getName();
    }

    @Override
    public int getPrice() {
        return drink.getPrice()+price;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+"\n"+description;
    }
}

