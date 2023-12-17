package base;

public class Water implements Base {

    @Override
    public String getName() {
        return "На чём основан напиток: на воде\n";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
