public class Main {
    public static void main(String[] args) {
        //циклы часть 2
        //домашнее задание 1


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

        //домашнее задание 2

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
        int y = 12_000_000;

        //домашнее задание 3

        int population = 12_000_000;//население
        int popPlus = 17;//рождаемость
        int popMinus = 8;//смертность
        for (int i = 1; i<=12; i++) {
            population = population + ((population/1000)*(popPlus-popMinus));
            System.out.println("год " + i + ", численность насленения составляет " + population + " человек");
        }



    }
}