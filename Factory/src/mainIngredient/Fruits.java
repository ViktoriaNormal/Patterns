package mainIngredient;

public class Fruits implements MainIngredient{

    @Override
    public String getName() {
        return "Главный ингредиент: фрукты\n";
    }

    @Override
    public int getPrice() {
        return 43;
    }
}
