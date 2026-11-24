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

        int firstFriday = 3; // первая пятница месяца (например, 3-е число)

        for (int day = 1; day <= 31; day++) {
            // Проверяем, является ли день пятницей
            // Пятницы: firstFriday, firstFriday + 7, firstFriday + 14, ...
            if ((day - firstFriday) % 7 == 0 && day >= firstFriday) {
                System.out.println("Сегодня пятница, " + day
                        + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 2: Марафон =====
    public static void task2() {
        System.out.println("=== Задача 2: Марафон (do-while) ===");

        int totalDistance = 42195;
        int passedDistance = 0;
        int step = 500;

        do {
            int remaining = totalDistance - passedDistance;
            System.out.println("Держитесь! Осталось " + remaining + " метров.");
            passedDistance += step;
        } while (passedDistance < totalDistance);

        System.out.println();
        System.out.println("=== Задача 2: Марафон (for) ===");

        for (int distance = 0; distance < totalDistance; distance += step) {
            int remaining = totalDistance - distance;
            System.out.println("Держитесь! Осталось " + remaining + " метров.");
        }

        System.out.println();
    }

    // ===== ЗАДАЧА 3: Парковка (while) =====
    public static void task3() {
        System.out.println("=== Задача 3: Парковка (while) ===");

        int budget = 1000; // произвольная сумма, например 1000 рублей
        int day = 1;
        int paidDays = 0;

        while (budget > 0) {
            if (day % 5 == 0) {
                // Каждый пятый день — бесплатный, пропускаем оплату
                System.out.println("День " + day + ": парковка бесплатная.");
                day++;
                continue;
            }

            budget -= 100;
            paidDays++;
            day++;
        }

        System.out.println("На " + paidDays + " оплаченных дней хватит бюджета. "
                + "Всего дней парковки (с бесплатными): " + (day - 1));
        System.out.println();

        // ===== ЗАДАЧА 3: Парковка (for) =====
        System.out.println("=== Задача 3: Парковка (for) ===");

        int budgetFor = 1000;
        int paidDaysFor = 0;

        for (int dayFor = 1; budgetFor > 0; dayFor++) {
            if (dayFor % 5 == 0) {
                System.out.println("День " + dayFor + ": парковка бесплатная.");
                continue;
            }

            budgetFor -= 100;
            paidDaysFor++;
        }

        System.out.println("На " + paidDaysFor + " оплаченных дней хватит бюджета.");
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

            // Каждые полгода начисляем 7%
            if (month % 6 == 0) {
                total += total * interestRate;
            }

            System.out.println("Месяц " + month + ", сумма накоплений: "
                    + (int) total + " рублей.");

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

            // Проверка перегрева каждые 10 минут
            if (minute % overheatingInterval == 0) {
                overheats++;
                System.out.println("Минута " + minute
                        + ": перегрев! Зарядка прервана на 2 минуты. "
                        + "Перегревов: " + overheats);

                if (overheats > maxOverheats) {
                    System.out.println("Зарядка прекращена. Текущий заряд: "
                            + charge + "%.");
                    break;
                }

                // Пропускаем 2 минуты (пауза на охлаждение)
                minute += 2;
                continue;
            }

            charge += chargePerMinute;

            // Проверка достижения 100%
            if (charge >= 100) {
                charge = 100;
                break;
            }
        }

        System.out.println("Время зарядки составило " + minute + " минут.");
        System.out.println();
    }
}
