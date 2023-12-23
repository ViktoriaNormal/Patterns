package topping;

public class Alco implements Topping{

    @Override
    public String getName() {
        return "Топпинг: алкоголь";
    }

    @Override
    public int getPrice() {
        return 70;
    }
}
