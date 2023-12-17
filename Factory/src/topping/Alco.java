package topping;

public class Alco implements Topping{

    @Override
    public String getName() {
        return "Топпинг: алкогольный напиток";
    }

    @Override
    public int getPrice() {
        return 70;
    }
}
