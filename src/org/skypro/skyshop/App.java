package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        // --- 1. Тестирование корзины (из прошлого ДЗ) ---
        ProductBasket basket = new ProductBasket();

        Product p1 = new SimpleProduct("Молоко", 100);
        Product p2 = new DiscountedProduct("Хлеб", 80, 20);
        Product p3 = new FixPriceProduct("Жвачка");
        Product p4 = new SimpleProduct("Сыр", 300);
        Product p5 = new DiscountedProduct("Колбаса", 500, 10);
        Product p6 = new SimpleProduct("Масло", 150);

        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.addProduct(p4);
        basket.addProduct(p5);
        basket.addProduct(p6); // Не добавится, корзина полна

        System.out.println("--- Содержимое корзины ---");
        basket.printBasket();
        System.out.println();


        // --- 2. Тестирование поискового движка (новое ДЗ) ---
        System.out.println("--- Тестирование SearchEngine ---");

        // Создаем поисковый движок вместимостью 10 элементов
        SearchEngine searchEngine = new SearchEngine(10);

        // Добавляем товары (они уже реализуют Searchable через абстрактный класс Product)
        searchEngine.add(p1); // Молоко
        searchEngine.add(p2); // Хлеб
        searchEngine.add(p3); // Жвачка
        searchEngine.add(p4); // Сыр

        // Создаем и добавляем статьи
        Article article1 = new Article("Как выбрать молоко", "Смотрите на жирность и срок годности. Молоко бывает пастеризованным.");
        Article article2 = new Article("Рецепт бутерброда", "Возьмите хлеб, сыр и колбасу. Это отличный завтрак.");
        Article article3 = new Article("Польза жвачки", "Жвачка помогает очистить зубы после еды, но не заменяет чистку.");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);

        // Демонстрация поиска
        System.out.println("Поиск по запросу 'молоко':");
        Searchable[] results1 = searchEngine.search("молоко");
        printSearchResults(results1);

        System.out.println("\nПоиск по запросу 'хлеб':");
        Searchable[] results2 = searchEngine.search("хлеб");
        printSearchResults(results2);

        System.out.println("\nПоиск по запросу 'сыр':");
        Searchable[] results3 = searchEngine.search("сыр");
        printSearchResults(results3);

        System.out.println("\nПоиск по запросу 'несуществующий товар':");
        Searchable[] results4 = searchEngine.search("космический корабль");
        printSearchResults(results4);
    }

    // Вспомогательный метод для красивого вывода результатов поиска
    private static void printSearchResults(Searchable[] results) {
        // Фильтруем null-элементы для чистого вывода, но показываем, что массив может их содержать
        for (Searchable item : results) {
            if (item != null) {
                System.out.println("Найдено: " + item.getStringRepresentation());
                // Если нужно вывести полное содержимое для статьи, можно раскомментировать:
                // System.out.println(item.toString());
            }
        }
        // Альтернативный вывод через Arrays.toString, как в подсказке:
        // System.out.println(Arrays.toString(results));
    }
}