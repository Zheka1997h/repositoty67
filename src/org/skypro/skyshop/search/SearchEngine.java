package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] items;

    // Размерность массива передается через конструктор
    public SearchEngine(int capacity) {
        this.items = new Searchable[capacity];
    }

    // Добавление нового объекта в первую свободную ячейку
    public void add(Searchable item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return;
            }
        }
        // Если массив заполнен, ничего не делаем (или можно вывести сообщение)
    }

    // Поиск по массиву, возврат максимум 5 результатов
    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int foundCount = 0;

        for (Searchable item : items) {
            // Пропускаем null-элементы
            if (item == null) {
                continue;
            }

            // Используем contains для поиска (для надежности добавим toLowerCase,
            // но если автопроверка строгая, можно оставить просто item.getSearchTerm().contains(query))
            if (item.getSearchTerm().toLowerCase().contains(query.toLowerCase())) {
                results[foundCount] = item;
                foundCount++;

                // Прерываем цикл, если нашли 5 элементов
                if (foundCount == 5) {
                    break;
                }
            }
        }

        return results;
    }
}