public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("task 1");
        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        int month = 0;
        while (sum < desiredSum) {
            sum = sum + amount;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("task 2");
        int start = 1;
        while (start < 11) {
            System.out.print(start + " ");
            start = start + 1;}
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }

        // task 3
        System.out.println("task 3");
        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousand /1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //task 4
        System.out.println("task 4");
        double percent = 7D / 100;
        desiredSum = 12_000_000;
        sum = amount;
        month =0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent ));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        //task 5
        System.out.println("task 5");
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum  * (1 + percent));
            month++;
            if (month %  6== 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }

        }
        //task 6
        System.out.println("task 6");
        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int)  (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //task 7
        System.out.println("task 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        //task 8
        System.out.println("task 8");
        int period = 79;
        int startSeeing = 0;
        int startComet = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += period) {
            if (year > startComet) {
                System.out.println(year);
            }
        }










    }

}