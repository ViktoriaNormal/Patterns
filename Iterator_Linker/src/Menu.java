import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuItem {

    private String name;
    private double price;
    private boolean vegetarian;
    private List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String name, double price, boolean vegetarian) {
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void remove(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    public MenuItem getChild(int
                                     i) {
        return menuItems.get(i);
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
        System.out.println("\n" + getName() + ", $" + getPrice() + " " + (isVegetarian() ? "(veg)" : ""));
        for (MenuItem menuItem : menuItems) {
            menuItem.print();
        }
    }
}
