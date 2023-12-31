package org.example;


import java.util.Scanner;

/*
Вам нужно запрограммировать робота, который должен познакомиться с пользователем, поздороваться с ним в зависимости от времени суток и поздравить с успехами в программировании. Для этого нужно объявить и реализовать такие методы:
Метод welcomeUserByName() должен спрашивать у пользователя имя, а потом сообщать, что рад знакомству.
Метод sayHelloByTime() должен спрашивать у пользователя время и в зависимости от ответа печатать приветствие:
начиная с 22 часов вечера и до 6 часов утра не включительно — "Доброй ночи!";
начиная с 6 до 12 не включительно — "Доброе утро!";
начиная с 12 до 18 не включительно — "Добрый день!";
начиная с 18 до 22 не включительно — "Добрый вечер!".
Третий метод printSuccess() должен печать только одну строку — "У вас уже неплохо получается программировать!".
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
        String byName = welcomeUserByName();
        int sayHelloByTime = sayHelloByTime();
        String printsuccess = printSuccess();
    }

    public static String welcomeUserByName() { // Объявите метод welcomeUserByNam// e
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        // Сохраните введённое пользователем имя в переменную name
        String name = scanner.nextLine();
        System.out.println("Рад познакомиться, " + name + "!");
        return name;
    }

    public static int sayHelloByTime() {
        System.out.println("Который час?");
        Scanner scanner = new Scanner(System.in);
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

    public static String printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
        return null;
    }


}