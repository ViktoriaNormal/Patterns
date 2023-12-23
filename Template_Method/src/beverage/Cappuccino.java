package beverage;

public class Cappuccino extends Beverage{

    public Cappuccino() {
        description = "Каппучино";
    }

    public int cost() {
        return (int) (155 / volume);
    }
}
