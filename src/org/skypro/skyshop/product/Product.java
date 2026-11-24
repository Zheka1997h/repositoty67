package org.skypro.skyshop.product;

public abstract class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Поле price удалено, метод стал абстрактным
    public abstract int getPrice();

    // Новый абстрактный метод для определения, является ли товар специальным
    public abstract boolean isSpecial();
}