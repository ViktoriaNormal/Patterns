package beverage;

public class Tea extends Beverage {

    public Tea() {
        description = "Чай";
    }

    public int cost() {
        return (int) (100 / volume);
    }
}
