package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        String byName = welcomeUserByName();
        String sayHello = sayHello();
        String printcity = printCity();
        int sayHelloByTime = sayHelloByTime();
        String printSuccess = printSuccess();
    }

    public static String welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        // Допишите чтение города
        System.out.println("Напишите свой город");
        String city = scanner.nextLine();
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");

        return name;
    }
    public static String sayHello(){
        System.out.println("Привет!");
        return null;

    }

    public static String printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
        return null;

    }

    // Допишите метод sayHello(), который печатает: Привет!


    // Допишите метод printCity(), который печатает: Из какого вы города?
    public static String printCity(){
        System.out.println("Напишите свой город, чтобы я смог определить временную ось");
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();

        return city;
    }

    public static int sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour > 22) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }

        return currentHour;
    }
}