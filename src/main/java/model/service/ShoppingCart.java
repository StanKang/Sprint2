package model.service;

import model.Food;

public class ShoppingCart {

    private Food[] items;


    public ShoppingCart(Food[] items) {
        this.items = items;
    }


    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total = total + (items[i].getAmount() * items[i].getPrice());
        }
        return total;
    }


    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            double itemPrice = items[i].getAmount() * items[i].getPrice();
            double discount = items[i].getDiscount();
            total = total + (itemPrice - itemPrice * (discount / 100.0));
        }
        return total;
    }


    public double getVegetarianTotalPriceWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                total = total + (items[i].getAmount() * items[i].getPrice());
            }
        }
        return total;
    }

}