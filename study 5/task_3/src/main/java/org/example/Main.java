package org.example;

import javax.xml.parsers.SAXParser;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ниже вызовите новый метод
        String films = findHighestGrossingFilm();
    }

    public static String findHighestGrossingFilm() {
        int max = Integer.MIN_VALUE;
        String film1 = "Титаник";
        int income1 = 2194;
        String film2 = "Аватар";
        int income2 = 2810;
        String film3 = "Темный рыцарь";
        int income3 = 1084;

        String[] all_films = {film1, film2, film3};
        int[] all_incomes = {income1, income2, income3};

        for (int i = 0; i < all_incomes.length; i++) {
            if (all_incomes[i] > max) {
                max = all_incomes[i];
            }
        }

        for (int j = 0; j < all_films.length; j++) {
            if (all_films[j].equals(film2)) {
                String desiredFilm = all_films[j];
                break;
            }
        }

        String highestGrossingFilm = all_films[1];
        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);

        return highestGrossingFilm;

    }
}


