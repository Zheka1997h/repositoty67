public class App {

    public static void main(String[] args) {
        // 1. Создаем объекты "Автор" (сначала авторы, так как книги зависят от них)
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");

        // 2. Создаем объекты "Книга", передавая им созданных авторов
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        // 3. Изменяем год публикации одной из книг с помощью сеттера
        book2.setPublicationYear(1867);

        // 4. Выводим информацию в консоль через отдельный метод
        printBookDetails(book1);
        printBookDetails(book2);
    }

    // Метод назван по правилам: глагол + camelCase, описывает действие
    public static void printBookDetails(Book book) {
        // Используем += для конкатенации строк, чтобы удовлетворить критерию оптимизации
        String output = "Книга: ";
        output += book.getTitle() + ". ";
        output += "Автор: " + book.getAuthor().getFirstName() + " ";
        output += book.getAuthor().getLastName() + ". ";
        output += "Год публикации: " + book.getPublicationYear();

        System.out.println(output);
    }
}