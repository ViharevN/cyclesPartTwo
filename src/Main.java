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
    }
}