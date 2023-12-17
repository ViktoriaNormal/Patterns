package topping;

public class WithoutTopping implements Topping {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
