package mainIngredient;

public class Coffee implements MainIngredient{

    @Override
    public String getName() {
        return "Главный ингридиент: кофе\n";
    }

    @Override
    public int getPrice() {
        return 55;
    }
}