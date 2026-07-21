import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, "red");
        Apple greenApple = new Apple(8, 60, "green");

        Food[] foodItems = new Food[]{
                meat,
                redApple,
                greenApple
        };
        ShoppingCart shoppingCart = new ShoppingCart(foodItems);

        System.out.println("Общая сумма без скидки: " + shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + shoppingCart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианской еды без скидки: " + shoppingCart.getVegetarianTotalPriceWithoutDiscount());
    }

}
