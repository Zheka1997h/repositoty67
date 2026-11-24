import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ===== ЗАДАЧА 1: Объявление массивов =====
        // 1. Целочисленный массив с помощью new
        int[] intArray = new int[]{1, 2, 3};

        // 2. Массив дробных чисел, заполненный сразу
        double[] doubleArray = {1.57, 7.654, 9.986};

        // 3. Произвольный массив (строковый, заполненный сразу)
        String[] stringArray = {"Java", "массивы", "циклы"};


        // ===== ЗАДАЧА 2: Вывод по порядку через запятую (без запятой в конце) =====
        System.out.println("Задача 2: Прямой порядок");

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i < stringArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();


        // ===== ЗАДАЧА 3: Вывод в обратном порядке через запятую (без запятой в конце) =====
        System.out.println("Задача 3: Обратный порядок");

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();


        // ===== ЗАДАЧА 4: Нечетные числа сделать четными =====
        System.out.println("Задача 4: Преобразование нечетных в четные");

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                // Используем += для оптимизации, как требуется в критериях
                intArray[i] += 1;
            }
        }

        // Вывод результата с помощью Arrays.toString(), как разрешено в подсказке
        System.out.println(Arrays.toString(intArray));
    }
}