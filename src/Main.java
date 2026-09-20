//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int firstFriday = 1;
        for ( ; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " +firstFriday +"-е число. Необходимо подготовить отчет");
        }

        // задача 2.1
        int distance = 0;
        int myDistance = 500;
        int totalDistance = 42195;
        do {
            System.out.println("Держитесь! осталось " + totalDistance + " метров");
            totalDistance = totalDistance - myDistance;
            distance = distance + myDistance;
        } while (totalDistance >= 0);
        System.out.println("Цель достигнута!");

        // задача 2.2
        int d = 0;
        int t = 42195;
        for (; d <= t; d = d + 500) {
            int f = t - d;
            System.out.println("Держитесь! осталось " + f + " метров");
        }
        System.out.println("Цель достигнута!");

        // Задача 3.1
        int day = 1;
        int money = 500;
        int moneyOnOneDay = 100;
        while (money >= 100) {
            if (day % 5 == 0) {
                System.out.println("День " + day + " - бесплатная парковка");
                day++;
                continue;
            }
            money -= moneyOnOneDay;
            System.out.println("День " + day + ": осталось " + money + " рублей");
            day++;

        }
        System.out.println("Автомобиль можно поставить на " + (day-1) + " дней");

        /// Задача3.2
        int days = 1;
        int moneys = 500;
        for (; moneys > 0; moneys -= 100) {
            System.out.println("День " + (days) + ": осталось " + (moneys-100) + " рублей");
            days++;
            if (days % 5 == 0) {
                System.out.println("День " + days + " - бесплатная парковка");
                days++;
            }

        }
        System.out.println("Автомобиль можно поставить на " + (days-1) + " дней");

        /// Задача 4
        int month = 0;
        int total = 0;
        int salary = 15_000;
        while (true) {
            month++;
            if (month % 6 == 0) {
                total = total + (total / 100 * 7);
            }
            total = total + salary;
            if (total >= 12_000_000) {
                System.out.println("Месяц " + month + " сумма накоплений составляет " + total);
                break;
            }
            System.out.println("Месяц " + month + " сумма накоплений составляет " + total);
        }
        System.out.println("Чтобы накопить нужную сумму, потребовалось " + month + " месяца");


        /// Задача 5
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев " + overheats + "! Зарядка приостановлена на 2 минуты. Текущий заряд: " + charge + "%");
                if (overheats >= 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                minute++;
                continue;
            }
            charge += 2;
            System.out.println("Минута " + minute + ": заряд " + charge + "%");
        }
        System.out.println("Время зарядки составило " + minute + " минут.");







    }
}