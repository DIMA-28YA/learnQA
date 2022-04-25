package Lesson4;

import java.util.Scanner;

public class ForExample4 {
    public static void main(String[] args) {

        // Кассир написал программу которая получает с клавиатуры задание количество цен и
        //посчитывает сумму

        int quantity = 5;


        Scanner scanner = new Scanner(System.in);
        double total = 0.0;


        for (int i = 0; i < quantity; i++) {
            System.out.println("Please enter cost of item #" + (i + 1));
            double currentCost = scanner.nextDouble();
            total = total + currentCost;

        }

        System.out.println("Your total cost is " + total);
    }
}
