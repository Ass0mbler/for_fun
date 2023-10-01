package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую зарплату вы получите в этом месяце?");
        int salary = scanner.nextInt();
        System.out.println("Сколько планируете потратить на транспорт?");
        int transportMoney = scanner.nextInt();
        System.out.println("Сколько запланировано на супермаркеты?");
        int foodMoney = scanner.nextInt();
        System.out.println("Какую сумму хотите отложить?");
        int savings = scanner.nextInt();

        // Вызовите метод correctExpenses с правильными аргументами
        correctExpenses(salary, transportMoney, foodMoney, savings);

        // Напечатайте запланированные траты
        System.out.println("Вы планировали потратить: транспорт — " + transportMoney + ", "
                + "еда — " + foodMoney + ", "
                + "сбережения — " + savings + ".");
    }

    public static int correctExpenses(int transportMoney, int foodMoney, int savings, int salary) {



        // Объявите метод correctExpenses
        // Тело метода дано ниже

        int expensesSum = transportMoney + foodMoney + savings; // Считаем расходы
        if (expensesSum > salary) { // Проверяем, не превышают ли расходы зарплату
            int lackMoney = salary - expensesSum; // Считаем, сколько не хватает

            // Пока не начнёт хватать денег на транспорт — сокращаем траты на 100 рублей
            while ((salary - foodMoney) < transportMoney) {
                foodMoney = foodMoney - 100;
            }
            // Если не хватает денег на жизнь — не откладываем
            if (transportMoney + foodMoney + savings > salary) {
                savings = 0;
            }else {
                System.out.println("Придётся пересмотреть планы, вам не хватает " + lackMoney);
            }

            // Печатаем рекомендации

            System.out.println("Рекомендуемые траты: "
                    + "еда — " + foodMoney + ", "
                    + "сбережения — " + savings + ".");

        } else {
            System.out.println("В этом месяце дебет с кредитом сошлись!");
            int leftMoney = salary - expensesSum; // Считаем излишек средств
            System.out.println("Свободных средств " + leftMoney);


        }

        return salary;
    }
}