package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {
        // Создаем корзину
        ProductBasket basket = new ProductBasket();

        // Создаем продукты
        Product product1 = new Product("Ноутбук", 50000);
        Product product2 = new Product("Смартфон", 30000);
        Product product3 = new Product("Наушники", 5000);
        Product product4 = new Product("Клавиатура", 3000);
        Product product5 = new Product("Мышь", 2000);
        Product product6 = new Product("Монитор", 25000);

        // 1. Добавление продукта в корзину
        System.out.println("=== 1. Добавление продукта в корзину ===");
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.printBasket();
        System.out.println();

        // 2. Добавление продукта в заполненную корзину (нет свободного места)
        System.out.println("=== 2. Добавление в заполненную корзину ===");
        basket.addProduct(product4);
        basket.addProduct(product5);
        basket.addProduct(product6); // Корзина заполнена (5 элементов)
        System.out.println();

        // 3. Печать содержимого корзины с несколькими товарами
        System.out.println("=== 3. Печать содержимого корзины ===");
        basket.printBasket();
        System.out.println();

        // 4. Получение стоимости корзины с несколькими товарами
        System.out.println("=== 4. Получение стоимости корзины ===");
        System.out.println("Общая стоимость: " + basket.getTotalPrice());
        System.out.println();

        // 5. Поиск товара, который есть в корзине
        System.out.println("=== 5. Поиск товара, который есть в корзине ===");
        System.out.println("Ноутбук в корзине: " + basket.containsProduct("Ноутбук"));
        System.out.println();

        // 6. Поиск товара, которого нет в корзине
        System.out.println("=== 6. Поиск товара, которого нет в корзине ===");
        System.out.println("Планшет в корзине: " + basket.containsProduct("Планшет"));
        System.out.println();

        // 7. Очистка корзины
        System.out.println("=== 7. Очистка корзины ===");
        basket.clearBasket();
        System.out.println("Корзина очищена");
        System.out.println();

        // 8. Печать содержимого пустой корзины
        System.out.println("=== 8. Печать содержимого пустой корзины ===");
        basket.printBasket();
        System.out.println();

        // 9. Получение стоимости пустой корзины
        System.out.println("=== 9. Получение стоимости пустой корзины ===");
        System.out.println("Общая стоимость: " + basket.getTotalPrice());
        System.out.println();

        // 10. Поиск товара по имени в пустой корзине
        System.out.println("=== 10. Поиск товара по имени в пустой корзине ===");
        System.out.println("Ноутбук в корзине: " + basket.containsProduct("Ноутбук"));
    }
}
// 10. Поиск товара по имени в пустой корзине