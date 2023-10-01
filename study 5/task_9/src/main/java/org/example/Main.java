package org.example;

public class Main {
    public static void main(String[] args) {
        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};
        sayHello("Привет, Пиксель!", "Привет, Байт!");
        findMaxExpense(feedExpensesCat, feedExpensesHamster);
        findExpensesSum(feedExpensesCat, feedExpensesHamster);
       sayEnjoyMeal("Приятного аппетита, Пиксель!", "Приятного аппетита, Байт!");


    }

    public static void sayHello(String pic, String bait){
        pic = "Привет, Пиксель!";
        bait = "Привет, Байт!";
        System.out.println(pic);
        System.out.println(bait);
    }
    public static void sayEnjoyMeal(String pic, String bait){
        pic = "Приятного аппетита, Пиксель!";
        bait = "Приятного аппетита, Байт!";
        System.out.println("Пиксель");
        System.out.println(pic);
        System.out.println("Байт");
        System.out.println(bait);
    }


    public static int findMaxExpense(double[] feedExpennsesCat, double[] feedExpennsesHamster){
       double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
       double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        System.out.println("Информация о пикселе");
        double maxFeedExpenseCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            if (feedExpennsesCat[i] > maxFeedExpenseCat) {
                maxFeedExpenseCat = feedExpennsesCat[i];
            }


        }
        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseCat);
        System.out.println("Информация о байте");

        double maxFeedExpenseHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            if (feedExpensesHamster[i] > maxFeedExpenseHamster) {
                maxFeedExpenseHamster = feedExpensesHamster[i];
            }
        }

            System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseHamster);


        return 0;
    }
    public static int findExpensesSum(double[] feedExpensesCat, double[] feedExpensesHamster) {

        System.out.println("Информация о пикселе");
        double sumFeedCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            sumFeedCat = sumFeedCat + feedExpensesCat[i];
        }

        System.out.println("Всего на корм было потрачено " + sumFeedCat);

        System.out.println("Информация о байте");
        double sumFeedHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            sumFeedHamster = sumFeedHamster + feedExpensesHamster[i];
        }

        System.out.println("Всего на корм было потрачено " + sumFeedHamster);

        return 0;
    }
}