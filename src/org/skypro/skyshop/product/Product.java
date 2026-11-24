package org.skypro.skyshop.product;

public class Product {

    // Поля объявлены как private final - немодифицируемые после создания
    private final String name;
    private final int price;

    // Единственный конструктор, принимающий name и price
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры для доступа к полям
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
// 10. Поиск товара по имени в пустой корзине