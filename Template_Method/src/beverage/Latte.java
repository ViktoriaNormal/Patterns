package beverage;

public class Latte extends Beverage {

    public Latte() {
        description = "Латте";
    }

    public int cost() {
        return (int) (150 / volume);
    }
}
