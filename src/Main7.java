public class Main {

    public static void main(String[] args) {

        // ===== ЗАДАЧА 1: Формирование Ф. И. О. =====
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        // Используем += для конкатенации, как требует критерий оптимизации
        String fullName = "";
        fullName += lastName + " ";
        fullName += firstName + " ";
        fullName += middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);


        // ===== ЗАДАЧА 2: Перевод в верхний регистр =====
        // Используем метод toUpperCase()
        String fullNameUpper = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpper);


        // ===== ЗАДАЧА 3: Замена символа 'ё' на 'е' =====
        // Переопределяем fullName согласно условию задачи
        fullName = "Иванов Семён Семёнович";

        // Используем метод replace()
        String fullNameFixed = fullName.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameFixed);
    }
}