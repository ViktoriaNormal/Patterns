package beverage;

public class Mocktail extends Beverage{

    public Mocktail() {
        description = "Безалкогольный коктейль";
    }

    public int cost() {
        return (int) (200 / volume);
    }
}
