package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private final int price;

    public SimpleProduct(String name, int price) {
        super(name); // Вызываем конструктор родителя для инициализации name
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false; // Обычный товар не является специальным
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }
}