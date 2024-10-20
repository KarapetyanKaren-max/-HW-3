public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int task = 1;
        System.out.println("Задача - 1");

        for (int i = 0; i  <= 10; i = i + 1){
            System.out.println(i);}

        task = 2;
        System.out.println("Задача - 2");

        for (int i = 10; i  >= 0; i = i - 1){
            System.out.println(i);}

        task = 3;
        System.out.println("Задача - 3");

        for (int i = 0; i  <= 10; i = i + 2 ){
            System.out.println(i);}

        task = 4;
        System.out.println("Задача - 4");

        for (int i = 10; i  >= -10; i = i - 1){
            System.out.println(i);}

        task = 5;
        System.out.println("Задача - 5");

        for (int i = 1904; i  <= 2096; i = i + 4 ){
            System.out.println(i + " год является высокостным");}

        task = 6;
        System.out.println("Задача - 6");

        for (int i = 7; i  <= 100; i = i + 7 ){
            System.out.println(i);}

        task = 7;
        System.out.println("Задача - 7");

        for (int i = 1; i  <= 512; i = i * 2 ){
            System.out.println(i);}

        task = 8;
        System.out.println("Задача - 8");

        int salary = 29000;
        float total = 0;
        for (int i = 0; i  < 12; i++ ) {
            System.out.println(i);
            total = total + total/100;
            total = total + salary;

            System.out.println("Месяцев " + i + ", сумма накоплений равна " + total + " рублей");
        }

        task = 9;
        System.out.println("Задача - 9");

        task = 10;
        System.out.println("Задача - 10");


        int two = 2;
        int multiplication = 0;
        multiplication = multiplication * two;
        for (int i = 1; i  <= 10; i = i + 1){
            System.out.println("2 * " + i + " = " + two * i);}
    }

}