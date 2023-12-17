package mainIngredient;

public class Tea implements MainIngredient{

    @Override
    public String getName() {
        return "Главный ингредиент: чай\n";
    }

    @Override
    public int getPrice() {
        return 25;
    }
}
