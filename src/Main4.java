public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // ===== ЗАДАЧА 1: Пятницы в месяце =====
    public static void task1() {
        System.out.println("=== Задача 1: Пятницы в месяце ===");

        int firstFriday = 3; // первая пятница месяца

        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0 && day >= firstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();
    }

    // ===== ЗАДАЧА 2: Марафон =====
    public static void task2() {
        System.out.println("=== Задача 2: Марафон ===");

        int totalDistance = 42195;
        int passedDistance = 0;
        int step = 500;

        System.out.println("-- Версия с do-while --");
        do {
            int remaining = totalDistance - passedDistance;
            System.out.println("Держитесь! Осталось " + remaining + " метров.");
            passedDistance += step;
        } while (passedDistance < totalDistance);

        System.out.println("\n-- Версия с for --");
        for (int distance = 0; distance < totalDistance; distance += step) {
            int remaining = totalDistance - distance;
            System.out.println("Держитесь! Осталось " + remaining + " метров.");
        }
        System.out.println();
    }

    // ===== ЗАДАЧА 3: Парковка (ИСПРАВЛЕНО ПО ЗАМЕЧАНИЯМ) =====
    public static void task3() {
        System.out.println("=== Задача 3: Парковка ===");

        // --- Версия с циклом while ---
        // Явная инициализация переменных, как просил наставник
        int remainingBudget = 1000; // оставшаяся сумма
        int currentDay = 1;         // текущий день

        System.out.println("-- Расчет с использованием while --");
        while (remainingBudget > 0) {
            if (currentDay % 5 == 0) {
                System.out.println("День " + currentDay + ": парковка бесплатная.");
                currentDay++;
                continue;
            }
            remainingBudget -= 100;

            // Если после вычета бюджет стал отрицательным, этот день не засчитываем
            if (remainingBudget >= 0) {
                currentDay++;
            } else {
                break;
            }
        }
        // currentDay увеличился на 1 на последней итерации, поэтому вычитаем 1
        int totalDaysWhile = currentDay - 1;

        // Явный вывод результата в консоль после завершения расчетов
        System.out.println("Количество дней, на которые хватит бюджета (while): " + totalDaysWhile);
        System.out.println();


        // --- Версия с циклом for ---
        int budgetFor = 1000;
        int totalDaysFor = 0;

        System.out.println("-- Расчет с использованием for --");
        for (int dayFor = 1; budgetFor > 0; dayFor++) {
            if (dayFor % 5 == 0) {
                System.out.println("День " + dayFor + ": парковка бесплатная.");
                totalDaysFor++;
                continue;
            }
            budgetFor -= 100;

            if (budgetFor >= 0) {
                totalDaysFor++;
            } else {
                break;
            }
        }

        // Явный вывод результата в консоль после завершения расчетов
        System.out.println("Количество дней, на которые хватит бюджета (for): " + totalDaysFor);
        System.out.println();
    }

    // ===== ЗАДАЧА 4: Накопления до 12 млн =====
    public static void task4() {
        System.out.println("=== Задача 4: Накопления до 12 млн ===");

        int month = 0;
        double total = 0;
        int monthlyContribution = 15000;
        double interestRate = 0.07; // 7% каждые полгода
        int target = 12000000;

        while (true) {
            month++;
            total += monthlyContribution;

            if (month % 6 == 0) {
                total += total * interestRate;
            }

            System.out.println("Месяц " + month + ", сумма накоплений: " + (int) total + " рублей.");

            if (total >= target) {
                break;
            }
        }
        System.out.println("Цель достигнута за " + month + " месяцев.");
        System.out.println();
    }

    // ===== ЗАДАЧА 5: Умная зарядка =====
    public static void task5() {
        System.out.println("=== Задача 5: Умная зарядка ===");

        int charge = 20;
        int minute = 0;
        int overheats = 0;
        int maxOverheats = 3;
        int chargePerMinute = 2;
        int overheatingInterval = 10;

        while (charge < 100 && overheats <= maxOverheats) {
            minute++;

            if (minute % overheatingInterval == 0) {
                overheats++;
                System.out.println("Минута " + minute + ": перегрев! Зарядка прервана на 2 минуты. Перегревов: " + overheats);

                if (overheats > maxOverheats) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%.");
                    break;
                }

                minute += 2;
                continue;
            }

            charge += chargePerMinute;

            if (charge >= 100) {
                charge = 100;
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут.");
        System.out.println();
    }
}