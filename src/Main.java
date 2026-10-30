public class Main {
    public static void main(String[] args) {

        // ============================================
        // ЗАДАЧА 1: Объявление переменных и вывод
        // ============================================
        System.out.println("=== ЗАДАЧА 1 ===");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // ============================================
        // ЗАДАЧА 2: Увеличение каждой переменной на 4
        // ============================================
        System.out.println("\n=== ЗАДАЧА 2 ===");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // ============================================
        // ЗАДАЧА 3: Уменьшение переменных
        // ============================================
        System.out.println("\n=== ЗАДАЧА 3 ===");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // ============================================
        // ЗАДАЧА 4: Переменная friend (3 вывода)
        // ============================================
        System.out.println("\n=== ЗАДАЧА 4 ===");

        var friend = 19;
        System.out.println("friend = " + friend);

        friend = friend + 2;
        System.out.println("friend после +2 = " + friend);

        friend = friend / 7;
        System.out.println("friend после /7 = " + friend);

        // ============================================
        // ЗАДАЧА 5: Переменная frog (4 вывода)
        // ============================================
        System.out.println("\n=== ЗАДАЧА 5 ===");

        var frog = 3.5;
        System.out.println("frog = " + frog);

        frog = frog * 10;
        System.out.println("frog после *10 = " + frog);

        frog = frog / 3.5;
        System.out.println("frog после /3.5 = " + frog);

        frog = frog + 4;
        System.out.println("frog после +4 = " + frog);

        // ============================================
        // ЗАДАЧА 6: Масса боксеров
        // ============================================
        System.out.println("\n=== ЗАДАЧА 6 ===");

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;

        var totalWeight = firstBoxer + secondBoxer;
        var weightDifference = secondBoxer - firstBoxer;

        System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");
        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");

        // ============================================
        // ЗАДАЧА 7: Остаток от деления весов
        // ============================================
        System.out.println("\n=== ЗАДАЧА 7 ===");

        var remainder = secondBoxer % firstBoxer;
        System.out.println("Остаток от деления масс бойцов: " + remainder);

        // ============================================
        // ЗАДАЧА 8: Сотрудники и часы работы
        // ============================================
        System.out.println("\n=== ЗАДАЧА 8 ===");

        var totalHours = 640;
        var hoursPerEmployee = 8;
        var employeesCount = totalHours / hoursPerEmployee;

        System.out.println("Всего работников в компании — " + employeesCount + " человек");

        var newEmployeesCount = employeesCount + 94;
        var totalHoursNew = newEmployeesCount * hoursPerEmployee;

        System.out.println("Если в компании работает " + newEmployeesCount
                + " человек, то всего " + totalHoursNew
                + " часов работы может быть поделено между сотрудниками");
    }
}