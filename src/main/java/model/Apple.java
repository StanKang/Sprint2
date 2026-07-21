package model;
import model.constants.Colour;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;

    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return 60;
        }
        return 0;
    }
}
