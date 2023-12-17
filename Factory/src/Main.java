import decorator.*;
import drinks.*;
import volume.*;

public class Main {
    public static void main(String[] args) {

        Drink drink = new FactoryOfCoffee().createDrink();
        drink.setVolume(new FactoryOfBigVol().setVolume());
        drink = new Chocolate(drink);
        drink.getInformation();

        drink = new FactoryOfTea().createDrink();
        drink.setVolume(new FactoryOfMediumVol().setVolume());
        drink.getInformation();

        drink = new FactoryOfJuice().createDrink();
        drink.setVolume(new FactoryOfSmallVol().setVolume());
        drink.getInformation();
    }
}