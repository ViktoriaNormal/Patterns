package base;

public class Juice implements Base {

    @Override
    public String getName() {
        return "На чём основан напиток: на соке\n";
    }

    @Override
    public int getPrice() {
        return 43;
    }
}