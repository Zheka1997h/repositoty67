import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // ===== ЗАДАЧА 1: Операционная система =====
    public static void task1() {
        System.out.println("=== Задача 1: Операционная система ===");

        int clientOS = 1; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Неизвестная операционная система.");
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 2: ОС + год выпуска (БЕЗ вложенных if!) =====
    public static void task2() {
        System.out.println("=== Задача 2: ОС и год выпуска ===");

        int clientOS = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2014; // год выпуска телефона

        // Используем составные условия (&&), а не вложенные if
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Неизвестная операционная система.");
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 3: Високосный год =====
    public static void task3() {
        System.out.println("=== Задача 3: Високосный год ===");

        int year = 2024;

        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 4: Доставка карт =====
    public static void task4() {
        System.out.println("=== Задача 4: Доставка карт ===");

        int deliveryDistance = 95;
        int deliveryDays = 0;

        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Доставка на расстояние свыше 100 км не осуществляется.");
            System.out.println();
            return; // выходим из метода, дальше ничего не выводим
        }

        System.out.println("Потребуется дней: " + deliveryDays);
        System.out.println();
    }

    // ===== ЗАДАЧА 5: Сезон по номеру месяца (switch) =====
    public static void task5() {
        System.out.println("=== Задача 5: Сезон по месяцу ===");

        int monthNumber = 12;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12.");
            System.out.println();
            return;
        }

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " относится к сезону: Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " относится к сезону: Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " относится к сезону: Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " относится к сезону: Осень.");
                break;
            default:
                System.out.println("Неизвестный месяц.");
                break;
        }

        System.out.println();
    }
}