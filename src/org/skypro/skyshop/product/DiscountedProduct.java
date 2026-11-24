package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final int basePrice;
    private final int discount;

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        this.basePrice = basePrice;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        // Расчет цены со скидкой (например, 100 - 20% = 80)
        return basePrice - (basePrice * discount / 100);
    }

    @Override
    public boolean isSpecial() {
        return true; // Товар со скидкой — специальный
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discount + "%)";
    }
}
// Вызываем конструктор