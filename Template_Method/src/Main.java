import addOn.AddOn;
import addOn.Chocolate;
import beverage.Beverage;
import beverage.BeverageFactory;
import beverage.FlavoringDecorator;
import beverage.FreshFactory;
import orderProcessor.CoffeeOrderProcessor;
import orderProcessor.OrderProcessor;
import recipe.HotCoffeeWithMilkRecipe;

public class Main {
    public static void main(String[] args) {
        BeverageFactory freshFactory = new BeverageFactory() {
            @Override
            public Beverage createBeverage() {
                return null;
            }
            @Override
            public FlavoringDecorator createFlavoringDecorator(Beverage beverage) {
                return null;
            }
            @Override
            public AddOn createAddOn(Beverage beverage) {
                return null;
            }
        };

        Beverage fresh = freshFactory.createBeverage();
        fresh.setVolume(0.8);

        System.out.println("Вы заказали: " + fresh.getDescription() + ", объем: " + fresh.getVolume() + "л");
        System.out.println("Стоимость заказа: " + fresh.cost());

        OrderProcessor processor = new CoffeeOrderProcessor();
        processor.processOrder(fresh, 0.8, new HotCoffeeWithMilkRecipe(), 1,
                new Chocolate(fresh), "круассан", false, "оплата банковской картой");

        BeverageFactory freshFactory1 = new FreshFactory();
        Beverage fresh1 = freshFactory.createBeverage();
        FlavoringDecorator whip = freshFactory.createFlavoringDecorator(fresh);
        AddOn chocolate = freshFactory.createAddOn(fresh);
    }
}