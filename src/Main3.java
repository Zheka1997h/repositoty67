public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    // ===== ЗАДАЧА 1: Числа от 1 до 10 =====
    public static void task1() {
        System.out.println("=== Задача 1: Числа от 1 до 10 ===");

        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 2: Числа от 10 до 1 =====
    public static void task2() {
        System.out.println("=== Задача 2: Числа от 10 до 1 ===");

        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 3: Четные числа от 0 до 17 =====
    public static void task3() {
        System.out.println("=== Задача 3: Четные числа от 0 до 17 ===");

        for (int evenNumber = 0; evenNumber <= 17; evenNumber += 2) {
            System.out.println(evenNumber);
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 4: Числа от 10 до -10 =====
    public static void task4() {
        System.out.println("=== Задача 4: Числа от 10 до -10 ===");

        for (int number = 10; number >= -10; number--) {
            System.out.println(number);
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 5: Високосные года с 1904 по 2096 =====
    public static void task5() {
        System.out.println("=== Задача 5: Високосные года ===");

        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным.");
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 6: Последовательность 7, 14, 21... =====
    public static void task6() {
        System.out.println("=== Задача 6: Последовательность кратных 7 ===");

        for (int number = 7; number <= 98; number += 7) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println();
    }

    // ===== ЗАДАЧА 7: Последовательность 1, 2, 4, 8... =====
    public static void task7() {
        System.out.println("=== Задача 7: Степени двойки ===");

        for (int number = 1; number <= 512; number *= 2) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println();
    }

    // ===== ЗАДАЧА 8: Накопления по 29 000 рублей в месяц =====
    public static void task8() {
        System.out.println("=== Задача 8: Накопления без процентов ===");

        int monthlyContribution = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlyContribution;
            System.out.println("Месяц " + month + ", сумма накоплений равна "
                    + totalSavings + " рублей.");
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 9: Накопления с 12% годовых (1% в месяц) =====
    public static void task9() {
        System.out.println("=== Задача 9: Накопления с процентами ===");

        int monthlyContribution = 29000;
        double totalSavings = 0;
        double monthlyInterestRate = 0.01; // 1% в месяц

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlyContribution;
            totalSavings += totalSavings * monthlyInterestRate;
            System.out.println("Месяц " + month + ", сумма накоплений равна "
                    + (int) totalSavings + " рублей.");
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 10: Таблица умножения на 2 =====
    public static void task10() {
        System.out.println("=== Задача 10: Таблица умножения на 2 ===");

        int multiplier = 2;

        for (int number = 1; number <= 10; number++) {
            System.out.println(multiplier + "*" + number + "=" + (multiplier * number));
        }

        System.out.println();
    }
}