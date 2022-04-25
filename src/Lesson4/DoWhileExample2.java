package Lesson4;

import java.util.Scanner;

public class DoWhileExample2 {
    public static void main(String[] args) {
        // Написать программу которая выполняет сложение двух чисел, введенных с клавиатуры.
        // Пользователь сможет повтарять действия до тех пор, пока не скажет хватит.

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter first number ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter second number ");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;

            System.out.println( " The sum is " + sum);
            System.out.println( " World you like to enter again true/false");
            again = scanner.nextBoolean();

        } while (again);
    }
}
