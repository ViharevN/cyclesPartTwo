public class Main {
    public static void main(String[] args) {
        //циклы часть 2
        //домашнее задание 1
        //задание 1


        int total = 0;
        int salary = 15_000;
        int months = 0;
        while (total <= 2_459_000) {
            total = total + (total/100);
            total = salary + total;
            months = months + 1;
            System.out.println(months + " месяц");
            System.out.println(total + " кэш");
            System.out.println("Месяц " + months + " , сумма накоплений равна " + total + " рублей");
        }

        //задание 2

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10 ; a >= 1 ; a--) {
            System.out.print(a + " ");
        }

        System.out.println();

        //задание 3

        int population = 12_000_000;//население
        int popPlus = 17;//рождаемость
        int popMinus = 8;//смертность
        for (int i = 1; i<=12; i++) {
            population = population + (population/1000)*(popPlus-popMinus);
            System.out.println("год " + i + ", численность насленения составляет " + population + " человек");
        }

        //домашнее задание часть 2
        //задание 1

        System.out.println();
        int totalCash = 15000;//начальная сумма вклада
        months = 0;
        while (totalCash <= 12_000_000) {
            totalCash = totalCash +(totalCash/100*7);//считаем вклад + процент от вклада
            months++;//месяцы
            System.out.println("месяц " + months + ", сумма накоплений " + totalCash);
        }

        //задание 2

        System.out.println();
        totalCash = 15000;
        months = 0;
        while (totalCash <= 12_000_000) {
            totalCash = totalCash +(totalCash/100*7);//считаем вклад + процент от вклада
            months++;//месяцы
            if ( months % 6 ==0 ) {
                System.out.println("месяц " + months + ", сумма накоплений " + totalCash);
            }
        }

        //задание 3

        System.out.println();
        totalCash = 15000;
        months = 0;//в 9 годах у нас 12*9=108 месяцев
        while (months <= 108) {
            totalCash = totalCash +(totalCash/100*7);//считаем вклад + процент от вклада
            months++;//месяцы
            if ( months % 6 ==0 ) {
                System.out.println("месяц " + months + ", сумма накоплений " + totalCash);
            }
        }

        //задание 4

        System.out.println();
        int friday = 7;//первое число пятницы в месяце
        int days = 31;//количество дней в месяце
        for (int i = friday; i < days; i+=7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

        //домашнее задание часть 3
        //задание 1

        int year = 1800;//за 200 лет до старта до текущего года
        int currentYear = 2100;//100 лет после текущего года, когда мы будем наблюдать
        while (year < currentYear) {
            year+=1;
            if (year%79==0) {
                System.out.println(year + ", можно наблюдать комету");
            }
        }
        //задание 2

        System.out.println();
        int number = 0;
        while (number < 10) {
            number++;
            System.out.println("2*"+number+"="+number*2);
        }
        System.out.println();
        for (int i = 1; i<=10;i++) {
            System.out.println("2*"+i+"="+i*2);
        }




    }
}