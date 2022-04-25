package Lesson4;

import java.util.Scanner;

public class WhileExample1 {
    // Каждый QA зарабатывает 10$.
    //Написать программу для ввода отработанных часов за неделю. Овертайить нельзя.

    public static void main(String[] args) {
        int rate = 10;
        int maxHours = 40;

        System.out.println("how many hours did you last week?");
        Scanner scanner = new Scanner(System.in);
        int howManyHours = scanner.nextInt();

        while (howManyHours > maxHours){ // boolean
            System.out.println("Invalid entry, Please  try again ");
            howManyHours = scanner.nextInt();
        }
        scanner.close();

        int salary = howManyHours * rate;

        System.out.println("Your salary is "+ salary);

    }
}
