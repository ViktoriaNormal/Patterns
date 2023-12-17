package topping;

public class Syrup implements Topping {

    @Override
    public String getName() {
        return "Топпинг: cироп";
    }

    @Override
    public int getPrice() {
        return 46;
    }
}