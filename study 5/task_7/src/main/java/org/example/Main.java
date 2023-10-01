package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         // Сохраните общее число мячиков Пикселя в переменной balls
        int balls = 15;
        System.out.println("У Пикселя " + balls + " мячиков");
        playPixel(balls);

		 // Поиграйте с Пикселем, вызвав метод playPixel

        // После игры Пиксель должен вернуть все мячики на место!
        System.out.println("Пиксель вернул все мячики");
        System.out.println("Их снова " + balls);
    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячиков он спрятал?");
         // Сохраните количество мячиков, которые спрятал Пиксель, в переменную hiddenBalls
        int hiddenBalls = scanner.nextInt();

        balls = balls - hiddenBalls;  // Посчитайте, сколько у Пикселя осталось мячиков
        System.out.println("Осталось " + balls);
    }
}