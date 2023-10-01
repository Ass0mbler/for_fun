package org.example;

public class Main {
    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double max = expenses[0];
        double maxExpense = findMaxExpense(expenses);
        // Вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);

    }
        // Объявите метод findMaxExpense
        // Реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
        // Самую большую трату запишите в переменную maxExpense



        public static double findMaxExpense(double[] doubles) {
            double[] exp = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
            double max = exp[0];
            double maxNumber = Integer.MIN_VALUE;
            for (int i = 0; i < exp.length; i++) {
                if (exp[i] > maxNumber) {
                    maxNumber = exp[i];

            }

        }

            return maxNumber;
        }


        }
