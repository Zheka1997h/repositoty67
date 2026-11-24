public class Book {
    // 1. Поля (одно из них типа Author)
    private String title;
    private Author author;
    private int publicationYear;

    // 2. Конструктор, принимающий значения для всех полей
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // 3. Геттеры для всех полей
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // 4. Сеттер только для поля "Год публикации"
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}