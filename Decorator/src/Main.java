public class Main {

    public static void main(String[] args) {
        Product espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Syrup(espresso);
        System.out.println(espresso.getDescription() + "Итоговая цена вашего эспрессо: " + espresso.getPrice());

        System.out.println();

        Product cappuccino = new Cappuccino();
        cappuccino = new Milk(cappuccino);
        cappuccino = new Syrup(cappuccino);
        System.out.println(cappuccino.getDescription() + "Итоговая цена вашего капучино: " + cappuccino.getPrice());
    }
}