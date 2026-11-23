public class Work_2 {
    public static void main(String[] args) {

        // ========================
        // Задача 1
        // ========================
        int intVariable = 40000;
        byte byteVariable = 22;
        short shortVariable = 30000;
        long longVariable = 987678965549L;
        float floatVariable = 3.75f;
        double doubleVariable = 27.12;

        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);

        // ========================
        // Задача 2
        // ========================
        double valueOne = 27.12;
        long valueTwo = 987_678_965_549L;
        double valueThree = 2.786;
        short valueFour = 569;
        short valueFive = -159;
        int valueSix = 27897;
        byte valueSeven = 67;

        System.out.println("valueOne = " + valueOne);
        System.out.println("valueTwo = " + valueTwo);
        System.out.println("valueThree = " + valueThree);
        System.out.println("valueFour = " + valueFour);
        System.out.println("valueFive = " + valueFive);
        System.out.println("valueSix = " + valueSix);
        System.out.println("valueSeven = " + valueSeven);

        // ========================
        // Задача 3
        // ========================
        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalPaper = 480;

        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        // ========================
        // Задача 4
        // ========================
        int bottlesPerTwoMinutes = 16;
        int bottlesPerMinute = bottlesPerTwoMinutes / 2;

        int minutesTwenty = 20;
        int minutesPerDay = 24 * 60;
        int daysThree = 3;
        int daysInMonth = 30;

        int bottlesTwentyMinutes = bottlesPerMinute * minutesTwenty;
        int bottlesPerDay = bottlesPerMinute * minutesPerDay;
        int bottlesThreeDays = bottlesPerDay * daysThree;
        int bottlesPerMonth = bottlesPerDay * daysInMonth;

        System.out.println("За 20 минут машина произвела " + bottlesTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        // ========================
        // Задача 5
        // ========================
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;

        int numberOfClasses = totalCans / cansPerClass;
        int totalWhiteCans = numberOfClasses * whiteCansPerClass;
        int totalBrownCans = numberOfClasses * brownCansPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно "
                + totalWhiteCans + " банок белой краски и "
                + totalBrownCans + " банок коричневой краски");

        // ========================
        // Задача 6
        // ========================
        int bananasCount = 5;
        int bananaWeight = 80;

        int milkMl = 200;
        int milkWeightPer100Ml = 105;
        int milkWeight = (milkMl / 100) * milkWeightPer100Ml;

        int iceCreamBrickets = 2;
        int iceCreamWeight = 100;

        int eggsCount = 4;
        int eggWeight = 70;

        int totalWeightGr = bananasCount * bananaWeight
                + milkWeight
                + iceCreamBrickets * iceCreamWeight
                + eggsCount * eggWeight;

        int grPerKg = 1000;
        float weightKg = totalWeightGr / (float) grPerKg;

        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGr + " г");
        System.out.println("Вес спортзавтрака в килограммах: " + weightKg + " кг");

        // ========================
        // Задача 7
        // ========================
        int weightToLoseKg = 7;
        int weightToLoseGr = weightToLoseKg * 1000;

        int lossPerDaySlow = 250;
        int lossPerDayFast = 500;

        int daysSlow = weightToLoseGr / lossPerDaySlow;
        int daysFast = weightToLoseGr / lossPerDayFast;
        int daysAverage = (daysSlow + daysFast) / 2;

        System.out.println("При потере 250 г в день: " + daysSlow + " дней");
        System.out.println("При потере 500 г в день: " + daysFast + " дней");
        System.out.println("В среднем потребуется: " + daysAverage + " дней");

        // ========================
        // Задача 8
        // ========================
        double mashaSalary = 67_760;
        double denisSalary = 83_690;
        double kristinaSalary = 76_230;

        double bonusPercent = 10;

        double mashaBonus = mashaSalary / 100 * bonusPercent;
        double denisBonus = denisSalary / 100 * bonusPercent;
        double kristinaBonus = kristinaSalary / 100 * bonusPercent;

        double mashaNewSalary = mashaSalary + mashaBonus;
        double denisNewSalary = denisSalary + denisBonus;
        double kristinaNewSalary = kristinaSalary + kristinaBonus;

        int monthsInYear = 12;

        double mashaYearBefore = mashaSalary * monthsInYear;
        double mashaYearAfter = mashaNewSalary * monthsInYear;
        double mashaYearDiff = mashaYearAfter - mashaYearBefore;

        double denisYearBefore = denisSalary * monthsInYear;
        double denisYearAfter = denisNewSalary * monthsInYear;
        double denisYearDiff = denisYearAfter - denisYearBefore;

        double kristinaYearBefore = kristinaSalary * monthsInYear;
        double kristinaYearAfter = kristinaNewSalary * monthsInYear;
        double kristinaYearDiff = kristinaYearAfter - kristinaYearBefore;

        System.out.println("Маша теперь получает " + mashaNewSalary
                + " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary
                + " рублей. Годовой доход вырос на " + denisYearDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary
                + " рублей. Годовой доход вырос на " + kristinaYearDiff + " рублей");
    }
}