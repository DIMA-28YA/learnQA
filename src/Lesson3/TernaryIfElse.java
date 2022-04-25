package Lesson3;

import java.util.Scanner;

public class TernaryIfElse {

    // Если уровень пройден то левел инкрементится
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите текущий уровень ");
        int currentLevel = scanner.nextInt();
        System.out.println("Введите пройден ли уровень ");
        boolean isLevelPassed = scanner.nextBoolean();

        int nextLevel = currentLevel + 1;

                        // True         // we here
        currentLevel = isLevelPassed ? nextLevel : currentLevel;
                        // Falce                    //we here
        System.out.println("Your current level is " + currentLevel);


    }
}
