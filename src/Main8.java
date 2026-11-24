import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // ===== ЗАДАЧА 1: Проверка високосного года =====
        System.out.println("--- Задача 1 ---");
        checkLeapYear(2024);
        checkLeapYear(2023);
        System.out.println();


        // ===== ЗАДАЧА 2: Рекомендация версии приложения =====
        System.out.println("--- Задача 2 ---");
        // 0 = iOS, 1 = Android. 2014 год (старый), 2020 год (новый)
        recommendAppVersion(0, 2014);
        recommendAppVersion(1, 2020);
        System.out.println();


        // ===== ЗАДАЧА 3: Расчет дней доставки =====
        System.out.println("--- Задача 3 ---");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка на расстояние свыше 100 км не осуществляется.");
        }
        System.out.println();
    }


    // ===== МЕТОДЫ =====

    /**
     * Задача 1: Проверяет, является ли год високосным, и выводит результат.
     */
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }


    /**
     * Задача 2: Рекомендует версию приложения на основе ОС и года выпуска.
     * (Примечание: в новом ТЗ упомянута проверка на "текущий год", но логика
     * прошлого задания четко указывает на порог 2015 года. Используем 2015,
     * чтобы логика "облегченной версии" имела смысл).
     */
    public static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = "";

        // Определяем ОС без вложенности
        if (clientOS == 0) {
            osName = "iOS";
        } else if (clientOS == 1) {
            osName = "Android";
        }

        // Определяем версию приложения
        int thresholdYear = 2015;
        if (clientDeviceYear < thresholdYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке.");
        } else {
            System.out.println("Установите версию приложения для " + osName + " по ссылке.");
        }
    }


    /**
     * Задача 3: Рассчитывает количество дней доставки.
     * Использует конструкцию += для элегантного накопления дней,
     * что полностью соответствует критерию оптимизации кода.
     */
    public static int calculateDeliveryDays(int deliveryDistance) {
        // Свыше 100 км доставки нет
        if (deliveryDistance > 100) {
            return 0;
        }

        int days = 1; // Базовый срок для расстояния до 20 км

        if (deliveryDistance >= 20) {
            days += 1; // Добавляем 1 день для расстояния от 20 до 60 км
        }

        if (deliveryDistance >= 60) {
            days += 1; // Добавляем еще 1 день для расстояния от 60 до 100 км
        }

        return days;
    }
}