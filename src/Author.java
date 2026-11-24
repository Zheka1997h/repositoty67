public class Author {
    // 1. Поля (private, чтобы инкапсулировать данные)
    private String firstName;
    private String lastName;

    // 2. Конструктор
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // 3. Геттеры для всех полей
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}