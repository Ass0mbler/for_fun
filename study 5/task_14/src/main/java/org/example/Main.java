package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Humster homka = new Humster();
        System.out.println("Имя: " + homka.name);
    }
    static class Humster{
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
    }


}
