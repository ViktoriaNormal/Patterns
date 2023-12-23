package beverage;

public class Fresh extends Beverage {

    public Fresh() {
        description = "Фруктовый фреш";
    }

    public int cost() {
        return (int) (150 / volume);
    }
}
