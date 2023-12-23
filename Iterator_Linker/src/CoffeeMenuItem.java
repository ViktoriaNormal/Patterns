public class CoffeeMenuItem implements MenuItem {

    private String name;
    private double price;
    private boolean vegetarian;

    public CoffeeMenuItem(String name, double price, boolean vegetarian) {
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.println(" " + getName() + " $" + getPrice() + " "
                + (isVegetarian() ? "(V)" : ""));
    }
}
