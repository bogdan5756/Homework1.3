import java.util.Locale;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int a = 1000000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 100;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 10000;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 1000000000;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 10.111f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 10.1001;
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2() {
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3() {
        System.out.println("Задание 3");
    byte lyudmila = 23;
    byte anna = 27;
    byte ekaterina = 30;
    short paper = 480;
    int totalStudent = lyudmila + anna + ekaterina;
    int student = paper / totalStudent;
    System.out.println("На каждого ученика рассчитано " + student + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задание 4");
    byte a = 16;
    byte b = 2;
    int efficiency = a / b;
    int twentyMinutes = efficiency * 20;
    int day = efficiency * 1440;
    int threeDay = day * 3;
    int month = day * 30;
    System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
    System.out.println("За сутки машина произвела " + day + " штук бутылок");
    System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
    System.out.println("За месяц машина произвела " + month + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задание 5");
    byte totalCans = 120;
    byte white = 2;
    byte brown = 4;
    int oneClassroom = white + brown;
    int totalClasses = totalCans / oneClassroom;
    int totalWhite = totalClasses * white;
    int totalBrown = totalClasses * brown;
    System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задание 6");
    byte banana = 80;
    byte milk = 105;
    byte iceCream = 100;
    byte eggs = 70;
    int totalGrams = (banana * 5) + (milk * 2) + (iceCream * 2) + (eggs * 4);
    float kilogram = totalGrams / 1000f;
    System.out.println(totalGrams);
    System.out.println(kilogram);
    }
    public static void task7() {
        System.out.println("Задание 7");
    int totalReset = 7000;
    int lossMin = 250;
    int lossMax = 500;
    double daysMax = (double) totalReset / lossMin;
    System.out.println("Максимальное кол-во дней для позхудения " + daysMax);
    double daysMin = (double) totalReset / lossMax;
    System.out.println("Минимальное кол-во дней для похудения " + daysMin);
    double averageGramDays = (lossMin + lossMax) / 2D;
    double averageDays = totalReset / averageGramDays;
    System.out.printf(Locale.US,"Среднее кол-во дней для похудения %.2f%n",averageDays);


    }
    public static void task8() {
        System.out.println("Задание 8");
    int masha = 67760;
    int denis = 83690;
    int kristina = 76230;
    double indexSalary = 1.1;
    double newSalaryMasha = masha * indexSalary;
    double newSalaryDenis = denis * indexSalary;
    double newSalaryKristina = kristina * indexSalary;
    double oldSalaryMasha = 12 * masha;
    double resultMasha = 12 * newSalaryMasha;
    double oldSalaryDenis = 12 * denis;
    double resultDenis = 12 * newSalaryDenis;
    double oldSalaryKristina = 12 * kristina;
    double resultKristina = 12 * newSalaryKristina;

    System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (resultMasha - oldSalaryMasha) + " рублей");
    System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (resultDenis - oldSalaryDenis) + " рублей");
    System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (resultKristina - oldSalaryKristina) + " рублей");
    }
}