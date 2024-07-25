public class Main {
    public static void main(String[] args) {
        //Задание 1 (без процентов)
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int a = 0;
        while (total < 2_459_000) {
            total = total + salary;
            a ++;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей");
        }
        //Задание 1 (с процентами)
        System.out.println("Задание 1");
        salary = 15000;
        total = 0;
        a = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            a++;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей");
        }
        //Задание 2
        System.out.println("Задание 2");
        int b = 10;
        while (b > 0) {
            System.out.print(b + " ");
            b --;
        }
        System.out.println();
        b = 1;
        for (; b <= 10; ) {
            System.out.print(b + " ");
            b ++;
        }
        System.out.println();
        //Задание 3
        System.out.println("Задание 3");
        int Y = 12_000_000;
        int birthRatePerYear = Y / 1000 * 17 - Y / 1000 * 8;
        int year = 2024;
        while (year < 2034) {
            Y = Y + birthRatePerYear;
            year ++;
            System.out.println("Год " + year + " численность населения составляет " + Y);
        }
        //Задание 4
        System.out.println("Задание 4");
        int totalVasilii = 15000;
        int month = 0;;
        while (totalVasilii < 12_000_000) {
            totalVasilii = totalVasilii +totalVasilii/7;
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalVasilii + " рублей");
        }
        //Задание 5
        System.out.println("Задание 5");
        totalVasilii = 15000;
        month = 0;
        while (totalVasilii < 12_000_000) {
            totalVasilii = totalVasilii +totalVasilii/7;
            month ++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalVasilii + " рублей");
            }
        }
        //Задание 6
        System.out.println("Задание 6");
        long totalVasiliiL = 15000;
        month = 0;
        while (month <= 108) {
            totalVasiliiL = totalVasiliiL +totalVasiliiL/7;
            month ++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalVasiliiL + " рублей");
            }
        }
        //Задание 7
        System.out.println("Задание 7");
        int firstFriday = 5;
        while (firstFriday <= 31) {
            if (firstFriday % 7 == 5) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            }
            firstFriday++;
        }
        //Задание 8
        System.out.println("Задание 8");
        int theBeginningOfTime = 0;
        while (theBeginningOfTime <= 2124) {
            if (theBeginningOfTime % 79 == 0 && theBeginningOfTime >= 1824) {
                System.out.println(theBeginningOfTime);
            }
            theBeginningOfTime++;
        }
    }
}
