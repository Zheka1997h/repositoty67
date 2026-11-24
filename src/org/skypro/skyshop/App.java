package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {

    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        // 1. Создаем товары разных типов (вместо старого new Product)
        Product p1 = new SimpleProduct("Молоко", 100);
        Product p2 = new DiscountedProduct("Хлеб", 80, 20); // 80 - 20% = 64
        Product p3 = new FixPriceProduct("Жвачка");
        Product p4 = new SimpleProduct("Сыр", 300);
        Product p5 = new DiscountedProduct("Колбаса", 500, 10); // 500 - 10% = 450
        Product p6 = new SimpleProduct("Масло", 150); // Этот товар не влезет

        System.out.println("--- 1. Добавление продуктов в корзину ---");
        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.printBasket();
        System.out.println();

        System.out.println("--- 2. Добавление продукта в заполненную корзину ---");
        basket.addProduct(p4);
        basket.addProduct(p5);
        basket.addProduct(p6); // Выведет: Невозможно добавить продукт
        System.out.println();

        System.out.println("--- 3. Печать содержимого корзины с несколькими товарами ---");
        basket.printBasket();
        System.out.println();

        System.out.println("--- 4. Получение стоимости корзины ---");
        System.out.println("Общая стоимость: " + basket.getTotalPrice());
        System.out.println();

        System.out.println("--- 5. Поиск товара, который есть в корзине ---");
        System.out.println("Молоко в корзине: " + basket.containsProduct("Молоко"));
        System.out.println();

        System.out.println("--- 6. Поиск товара, которого нет в корзине ---");
        System.out.println("Шоколад в корзине: " + basket.containsProduct("Шоколад"));
        System.out.println();

        System.out.println("--- 7. Очистка корзины ---");
        basket.clearBasket();
        System.out.println("Корзина очищена");
        System.out.println();

        System.out.println("--- 8. Печать содержимого пустой корзины ---");
        basket.printBasket();
        System.out.println();

        System.out.println("--- 9. Получение стоимости пустой корзины ---");
        System.out.println("Общая стоимость: " + basket.getTotalPrice());
        System.out.println();

        System.out.println("--- 10. Поиск товара по имени в пустой корзине ---");
        System.out.println("Молоко в корзине: " + basket.containsProduct("Молоко"));
    }
}