package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    // Приватный массив из 5 элементов, прямой доступ невозможен
    private Product[] products = new Product[5];

    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        // Ищем первую свободную ячейку
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        // Если не нашли свободную ячейку - корзина заполнена
        System.out.println("Невозможно добавить продукт");
    }

    // Метод получения общей стоимости корзины
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    // Метод, который печатает содержимое корзины
    public void printBasket() {
        boolean isEmpty = true;

        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + ": " + product.getPrice());
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("В корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalPrice());
        }
    }

    // Метод, проверяющий продукт в корзине по имени
    public boolean containsProduct(String name) {
        for (Product product : products) {
            if (product != null && product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Метод очистки корзины - проставляет всем элементам null
    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }
}
// 10. Поиск товара по имени в пустой корзине