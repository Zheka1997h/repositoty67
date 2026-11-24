import java.util.Scanner;

public class Work_2 {
    public static void main(String[] args) {

        /*Задача 1*/

        int AgeDiapozon = 18;

        System.out.print("Введите свой возраст: ");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= AgeDiapozon) {
           System.out.println("Вы достигли совершенолетия");
            System.out.println("Вам " + age + " лет");
        }
        else{
            int result = AgeDiapozon - age;
            System.out.println("Вы  не достигли совершенолетия Вам " + (age) + " лет.");

            if (result > 4 & result < 17){
                System.out.println("Вам осталось подождать " + result + " лет.");
            }
            if (result > 1 & result <= 4) {
                System.out.println("Вам осталось подождать " + result + " года.");
            }
            else if (result == 1){
                System.out.println("Вам осталось подождать " + result + " год.");
            }


        }


        /*Задача 2*/

        int temperatureD = 5;

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Введите температуру в градусах:  ");

        int age2 = scanner2.nextInt();

        if (age2 < temperatureD){
            System.out.print("На улице холодно, нужно надеть шапку");
        }
        else{
            System.out.print("Сегодня тепло, можно идти без шапки");
        }



        /*Задача 3*/
        System.out.println("=== Задача 3: Скорость ===");

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Введите скорость автомобиля (км/ч): ");
        int speed = scanner3.nextInt();

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }


        /*Задача 4*/
        System.out.println("=== Задача 4: Учреждение ===");

        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Введите возраст человека: ");
        int age4 = scanner4.nextInt();

        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад.");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу.");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то его место в университете.");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age4 + ", то он ещё слишком мал для учреждения.");
        }


        /*Задача 5*/
        System.out.println("=== Задача 5: Аттракцион ===");

        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Введите возраст ребёнка: ");
        int childAge = scanner5.nextInt();

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

        final int TOTAL_CAPACITY = 102;
        final int SEATS = 60;

        Scanner scanner6 = new Scanner(System.in);

        System.out.println("Сколько человек уже в вагоне? ");
        int peopleInWagon = scanner6.nextInt();

        if (peopleInWagon >= TOTAL_CAPACITY) {
            System.out.println("Вагон уже полностью забит. Мест нет.");
        } else if (peopleInWagon < SEATS) {
            int freeSeats = SEATS - peopleInWagon;
            System.out.println("В вагоне есть свободные сидячие места. Доступно: " + freeSeats);
        } else {
            int standingPlaces = TOTAL_CAPACITY - peopleInWagon;
            System.out.println("Свободны только стоячие места. Доступно: " + standingPlaces);
        }


        /*Задача 7*/

        System.out.println("=== Задача 7: Максимум из трёх чисел ===");

        Scanner scanner7 = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber = scanner7.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = scanner7.nextInt();

        System.out.println("Введите третье число: ");
        int thirdNumber = scanner7.nextInt();

        int maximum = firstNumber;

        if (secondNumber > maximum) {
            maximum = secondNumber;
        }

        if (thirdNumber > maximum) {
            maximum = thirdNumber;
        }

        System.out.println("Наибольшее из трёх чисел: " + maximum);

        scanner.close();
        System.out.println();




    }
}