package org.example;

import java.awt.font.TextAttribute;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Humster homka = new Humster();
        // Присвойте полям новые значения


        System.out.println("Вес: " + homka.weight);


        // Покормите хомяка и напечатайте его вес
        eat(15);
    }

        public static void eat (int newweight) {
            Humster humster = new Humster();

            if (newweight == 15){
                System.out.println("Хомка покушал");
            }
            newweight = humster.weight + newweight;

                System.out.println("Новый вес: " + newweight);





        }


    static class Humster {
       int weight = 400;


    }

}