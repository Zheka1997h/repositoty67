import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ===== ЗАДАЧА 1: Сумма, максимум, минимум, среднее =====
        int[] inputArray1 = {15000, 25000, 10000, 30000, 20000};
        float[] outputArray1 = new float[4]; // [сумма, максимум, минимум, среднее]

        float sum = 0;
        float max = inputArray1[0];
        float min = inputArray1[0];

        // Используем for-each для всех расчетов, как требует критерий
        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }

        float average = sum / inputArray1.length;

        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;

        System.out.println("Задача 1:");
        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));
        System.out.println();


        // ===== ЗАДАЧА 2: Налог 13% =====
        int[] inputArray2 = {50000, 60000, 45000, 80000, 55000};
        float[] outputArray2 = new float[inputArray2.length];

        int index2 = 0;
        for (int salary : inputArray2) {
            outputArray2[index2] = salary * 0.13f;
            index2++;
        }

        System.out.println("Задача 2:");
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));
        System.out.println();


        // ===== ЗАДАЧА 3: Бонусы выше 5000 (true/false) =====
        int[] inputArray3 = {3000, 6000, 4500, 8000, 2000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        int index3 = 0;
        for (int bonus : inputArray3) {
            outputArray3[index3] = (bonus > 5000);
            index3++;
        }

        System.out.println("Задача 3:");
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));
        System.out.println();


        // ===== ЗАДАЧА 4: Проверка на просрочки (break при первом отрицательном) =====
        int[] inputArray4 = {1000, 500, -200, 300, 400}; // -200 вызовет break
        boolean[] outputArray4 = new boolean[1]; // Единственное значение = массив из 1 элемента

        boolean hasNoOverdue = true;

        for (int balance : inputArray4) {
            if (balance < 0) {
                hasNoOverdue = false;
                break; // Прерываем цикл максимально быстро, как требует задание
            }
        }

        outputArray4[0] = hasNoOverdue;

        System.out.println("Задача 4:");
        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));
        System.out.println();


        // ===== ЗАДАЧА 5: Подсчет рентабельных месяцев =====
        int[] inputArray5 = {15000, -5000, 20000, 0, 10000};
        int[] outputArray5 = new int[1]; // Единственное значение = массив из 1 элемента

        int profitableMonths = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths += 1; // Используем += для оптимизации
            }
        }

        outputArray5[0] = profitableMonths;

        System.out.println("Задача 5:");
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));
        System.out.println();
    }
}