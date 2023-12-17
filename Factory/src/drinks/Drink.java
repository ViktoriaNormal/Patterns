package drinks;

import decorator.PriceList;
import base.Base;
import mainIngredient.MainIngredient;
import topping.Topping;
import volume.Volume;

public abstract class Drink {

    protected double price;
    Base base;
    MainIngredient mainIngredient;
    Topping topping;
    Volume volume;

    public Drink() {

    };

    public Drink(FactoryOfDrink factory){
        base = factory.createBase();
        mainIngredient = factory.createMainIngredient();
        topping = factory.createTopping();
    }

    public abstract String getName();

    public int getPrice(){
        return PriceList.workingCost + Math.round((base.getPrice() + mainIngredient.getPrice() +
                topping.getPrice()) * volume.getPriceAffection());
    };

    public String getDescription(){
        return "Размер: " + volume.getSize() + '\n' + base.getName() +
                mainIngredient.getName() + topping.getName();
    };

    protected void setBase(Base base) {
        this.base = base;
    }

    protected void setMainIngredient(MainIngredient mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    protected void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public void getInformation() {
        System.out.println(getName() + " " + getPrice()+ "\n" + getDescription());
    }
}
