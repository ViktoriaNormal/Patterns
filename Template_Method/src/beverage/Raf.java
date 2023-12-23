package beverage;

public class Raf extends Beverage {

    public Raf() {
        description = "Раф";
    }
    public int cost() {
        return (int) (250 / volume);
    }
}
