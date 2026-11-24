package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    // Константа в SCREAMING_SNAKE_CASE
    private static final int FIXED_PRICE = 99;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true; // Товар с фиксированной ценой — специальный
    }

    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + FIXED_PRICE;
    }
}