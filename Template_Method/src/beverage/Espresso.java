package beverage;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Эспрессо";
    }

    public int cost() {
        return (int) (180 / volume);
    }
}
