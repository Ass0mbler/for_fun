package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Humster homka = new Humster();
        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " + homka.weight);
        System.out.println("Цвет: " + homka.color);
    }
    static class Humster{

        String name = "Bob";
        int age = 1;
        int weight = 12;
        String color = "white";

    }
}