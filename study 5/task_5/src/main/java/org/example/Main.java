package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел = " + findMax());
        System.out.println("Наибольшее из чисел = " + findMax());
        System.out.println("Наибольшее из чисел = " + findMax());
        // Напишите аналогичный вызов метода findMax для таких пар чисел: 16 и 5, -1 и -7

    }

    public static int  findMax() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            return a;
        }



        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (c > d) {
            return c;

        }

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        if (n > x){
            return n;
        }
        return d;

    }

}