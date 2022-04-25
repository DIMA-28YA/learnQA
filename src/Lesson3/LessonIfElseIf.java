package Lesson3;

import java.util.Scanner;

public class LessonIfElseIf {

    // В зависимости сколько балов мы набрали в ПР нам присваивается левел

    public static void main(String[] args) {

        System.out.println("Введите свой ПР скор ");
        Scanner scanner = new Scanner(System.in);
        int yourPrScore = scanner.nextInt();
        scanner.close();

        String titel;
         if (yourPrScore > 150) {
            titel = "Senior";
        } else if (yourPrScore > 120 & yourPrScore < 150) {
            titel = "Middel";
        } else if (yourPrScore > 100 & yourPrScore < 120) {
            titel = "Middle - ";
        } else {
            titel = "Junior";
        }
        System.out.println(" Your titel is " + titel);
    }
}
