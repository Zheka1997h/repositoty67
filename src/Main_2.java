void main() {
    /*Задача 1*/
    int a = 4;
    byte Large = 125;
    short digitMin = 1245;
    long digitMax = 98828383;
    float Metro = 45.6843f;
    double PhisicalCount = 56.4545232324;
    System.out.println("Значение переменной" + a);
    System.out.println("Значение переменной" + Large);
    System.out.println("Значение переменной" + digitMin);
    System.out.println("Значение переменной" + digitMax);
    System.out.println("Значение переменной" + Metro);
    System.out.println("Значение переменной" + PhisicalCount);


    /*Задача 2*/
    float digit_1 = 27.12f;
    long myNumber = 987678965549L;
    float myNumber_2 = 2.786f;
    int digits = 569;
    int Bite = -159;
    short digit = 27897;
    byte House = 67;


    /*Задача 3*/
    int teacher_One = 23;
    int teacher_Two = 27;
    int teacher_Third = 30;

    int res = 480 / (teacher_One + teacher_Two + teacher_Third);

    int List_res_1 = teacher_One * res;
    int List_res_2 = teacher_Two  * res;
    int List_res_3 = teacher_Third * res;

    /*Проверка правильности решения*/
    int result = List_res_1 + List_res_2 + List_res_3;


    System.out.println(List_res_1);
    System.out.println(List_res_2);
    System.out.println(List_res_3);


    /*Задача 4*/
    int Boutlie = 16;
    int time = 2;

    /*Входные данные*/
    int time_1 = 20;
    int time_2 = 1440; /*1 день*/
    int time_3 = 4320; /*3 дня*/
    int time_4 = 43200; /*1 месяц*/

    /*Вычисление кратности бутылок*/
    int res_time_1 = time_1 / time;
    int res_time_2 = time_2 / time;
    int res_time_3 = time_3 / time;
    int res_time_4 = time_4 / time;

    /*Вычисление количества бутылок*/
    int res_1 = res_time_1 * Boutlie;
    int res_2 = res_time_2 * Boutlie;
    int res_3 = res_time_3 * Boutlie;
    int res_4 = res_time_4 * Boutlie;

    /*Вывод результата*/
    System.out.println("Произведено за "+ time_1 +"минут" + res_1+ "бутылок");
    System.out.println("Произведено за "+ time_2 +"минут" + res_2 + "бутылок");
    System.out.println("Произведено за "+ time_3 +"минут" + res_3 + "бутылок");
    System.out.println("Произведено за "+ time_4 +"минут" + res_4 + "бутылок");


    /*Задача 5*/

    int totalCans = 120;          // общее количество банок
    int whitePerClass = 2;        // банок белой краски на класс
    int brownPerClass = 4;

    // Вычисления
    int cansPerClass = whitePerClass + brownPerClass;  // 2 + 4 = 6
    int classrooms = totalCans / cansPerClass;         // 120 / 6 = 20
    int whiteCans = classrooms * whitePerClass;        // 20 * 2 = 40
    int brownCans = classrooms * brownPerClass;

    // Вывод результата
    System.out.println("В школе, где " + classrooms + " классов, нужно "
            + whiteCans + " банок белой краски и "
            + brownCans + " банок коричневой краски.");



    /*Задача 6*/
    // 1. Бананы: 5 штук по 80 грамм
    int bananaCount = 5;
    int bananaWeightOne = 80;
    int totalBananaWeight = bananaCount * bananaWeightOne;

    // 2. Молоко: 200 мл. Известно, что 100 мл = 105 грамм.
    // Сначала найдем вес 1 мл, затем умножим на 200.
    // Или проще: (200 / 100) * 105
    double milkVolumeMl = 200;
    double milkWeightPer100ml = 105;
    double totalMilkWeight = (milkVolumeMl / 100) * milkWeightPer100ml;

    // 3. Мороженое-пломбир: 2 брикета по 100 грамм
    int iceCreamCount = 2;
    int iceCreamWeightOne = 100;
    int totalIceCreamWeight = iceCreamCount * iceCreamWeightOne;

    // 4. Яйца сырые: 4 яйца по 70 грамм
    int eggCount = 4;
    int eggWeightOne = 70;
    int totalEggWeight = eggCount * eggWeightOne;

    // Подсчет общего веса в граммах
    // Приводим все к double для точности, так как молоко может быть не целым числом (хотя здесь 210.0)
    double totalWeightGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;

    // Перевод в килограммы (1 кг = 1000 г)
    double totalWeightKilograms = totalWeightGrams / 1000;

    // Вывод результатов в консоль
    System.out.println("Вес завтрака в граммах: " + totalWeightGrams);
    System.out.println("Вес завтрака в килограммах: " + totalWeightKilograms);


    /*Задача 7*/
    // Цель: сбросить 7 кг
    double weightToLoseKg = 7;

    // Переведем цель в граммы для удобства расчетов с дневными нормами
    double weightToLoseGrams = weightToLoseKg * 1000;

    // Вариант 1: Потеря 250 грамм в день
    double lossPerDayMin = 250;
    int daysAtMinRate = (int) Math.ceil(weightToLoseGrams / lossPerDayMin);

    // Вариант 2: Потеря 500 грамм в день
    double lossPerDayMax = 500;
    int daysAtMaxRate = (int) Math.ceil(weightToLoseGrams / lossPerDayMax);

    // Расчет среднего количества дней
    // Способ 1: Среднее арифметическое от двух крайних значений дней
    double averageDays = (daysAtMinRate + daysAtMaxRate) / 2.0;

    // Способ 2 (альтернативный): Расчет по средней скорости потери веса ((250+500)/2 = 375 г/день)
    // double avgLossRate = (lossPerDayMin + lossPerDayMax) / 2;
    // double averageDaysAlt = weightToLoseGrams / avgLossRate;

    // Вывод результатов в консоль
    System.out.println("Цель по снижению веса: " + weightToLoseKg + " кг (" + weightToLoseGrams + " г)");
    System.out.println("-------------------------------------------");
    System.out.println("Если терять по 250 г в день: " + daysAtMinRate + " дн.");
    System.out.println("Если терять по 500 г в день: " + daysAtMaxRate + " дн.");
    System.out.println("-------------------------------------------");
    System.out.println("Среднее количество дней: " + averageDays);


    /*Задача 8*/
    // Текущие месячные зарплаты сотрудников
    int mashaSalary = 67_760;
    int denisSalary = 83_690;
    int kristinaSalary = 76_230;

    // Процент повышения
    double raisePercent = 10;

    // Расчет повышения для каждого сотрудника (10% от текущей зарплаты)
    int mashaRaise = (int) (mashaSalary * raisePercent / 100);
    int denisRaise = (int) (denisSalary * raisePercent / 100);
    int kristinaRaise = (int) (kristinaSalary * raisePercent / 100);

    // Новая месячная зарплата после повышения
    int mashaNewSalary = mashaSalary + mashaRaise;
    int denisNewSalary = denisSalary + denisRaise;
    int kristinaNewSalary = kristinaSalary + kristinaRaise;

    // Годовой доход до и после повышения
    int mashaAnnualBefore = mashaSalary * 12;
    int mashaAnnualAfter = mashaNewSalary * 12;
    int mashaAnnualDiff = mashaAnnualAfter - mashaAnnualBefore;

    int denisAnnualBefore = denisSalary * 12;
    int denisAnnualAfter = denisNewSalary * 12;
    int denisAnnualDiff = denisAnnualAfter - denisAnnualBefore;

    int kristinaAnnualBefore = kristinaSalary * 12;
    int kristinaAnnualAfter = kristinaNewSalary * 12;
    int kristinaAnnualDiff = kristinaAnnualAfter - kristinaAnnualBefore;

    // Вывод результатов в консоль
    System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualDiff + " рублей.");
    System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualDiff + " рублей.");
    System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. ");

}