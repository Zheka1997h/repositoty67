import java.util.Scanner;

public class Work_2 {
    public static void main(String[] args) {

        // ОДИН scanner на всю программу — это правильнее и экономит ресурсы
        Scanner scanner = new Scanner(System.in);

        /*Задача 1*/
        int ageLimit = 18;

        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();

        if (age >= ageLimit) {
            System.out.println("Вы достигли совершеннолетия");
            System.out.println("Вам " + age + " лет");
        } else {
            int yearsToWait = ageLimit - age;
            System.out.println("Вы не достигли совершеннолетия. Вам " + age + " лет.");

            // Склонение: год / года / лет
            if (yearsToWait == 1) {
                System.out.println("Вам осталось подождать " + yearsToWait + " год.");
            } else if (yearsToWait >= 2 && yearsToWait <= 4) {
                System.out.println("Вам осталось подождать " + yearsToWait + " года.");
            } else {
                System.out.println("Вам осталось подождать " + yearsToWait + " лет.");
            }
        }


        /*Задача 2*/
        int temperatureThreshold = 5;

        System.out.print("Введите температуру в градусах: ");
        int temperature = scanner.nextInt();

        if (temperature < temperatureThreshold) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }


        /*Задача 3*/
        System.out.println("=== Задача 3: Скорость ===");

        System.out.println("Введите скорость автомобиля (км/ч): ");
        int speed = scanner.nextInt();

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }


        /*Задача 4*/
        System.out.println("=== Задача 4: Учреждение ===");

        System.out.println("Введите возраст человека: ");
        int personAge = scanner.nextInt();

        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то его место в университете.");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + personAge + ", то он ещё слишком мал для учреждения.");
        }


        /*Задача 5*/
        System.out.println("=== Задача 5: Аттракцион ===");

        System.out.println("Введите возраст ребёнка: ");
        int childAge = scanner.nextInt();

        if (childAge < 5) {
            System.out.println("Если возраст ребёнка равен " + childAge
                    + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.println("Есть ли рядом взрослый? (true/false): ");
            boolean hasAdult = scanner.nextBoolean();

            if (hasAdult) {
                System.out.println("Если возраст ребёнка равен " + childAge
                        + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребёнка равен " + childAge
                        + ", то ему нельзя кататься на аттракционе без сопровождения взрослого.");
            }
        } else {
            System.out.println("Если возраст ребёнка равен " + childAge
                    + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }


        /*Задача 6*/
        System.out.println("=== Задача 6: Вагон поезда ===");

        final int totalCapacity = 102;
        final int seats = 60;

        System.out.println("Сколько человек уже в вагоне? ");
        int peopleInWagon = scanner.nextInt();

        if (peopleInWagon >= totalCapacity) {
            System.out.println("Вагон уже полностью забит. Мест нет.");
        } else if (peopleInWagon < seats) {
            int freeSeats = seats - peopleInWagon;
            System.out.println("В вагоне есть свободные сидячие места. Доступно: " + freeSeats);
        } else {
            int standingPlaces = totalCapacity - peopleInWagon;
            System.out.println("Свободны только стоячие места. Доступно: " + standingPlaces);
        }


        /*Задача 7*/
        System.out.println("=== Задача 7: Максимум из трёх чисел ===");

        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int thirdNumber = scanner.nextInt();

        int maximum = firstNumber;

        if (secondNumber > maximum) {
            maximum = secondNumber;
        }

        if (thirdNumber > maximum) {
            maximum = thirdNumber;
        }

        System.out.println("Наибольшее из трёх чисел: " + maximum);

        scanner.close();
    }
}