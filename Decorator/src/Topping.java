public abstract class Topping extends Product {

    Product drink;

    public Topping(Product drink){
        this.drink = drink;
    }

    public String getDescription(){
        return drink.getDescription() + description;
    }

    public int getPrice(){
        return price + drink.getPrice();
    }
}
