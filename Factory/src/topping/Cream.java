package topping;

public class Cream implements Topping{

    @Override
    public String getName() {
        return "Топпинг: сливки";
    }

    @Override
    public int getPrice() {
        return 36;
    }
}
