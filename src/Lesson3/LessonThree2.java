package Lesson3;


import java.util.Scanner;

public class LessonThree2 {

    // Если закончил на уровне 1-3? то переходишь на следующий уровень
    // Если не прошел? То уровень жизни уменшается .
    public static void main(String[] args) {
        int currentLevel = 7;
        int levelCoin = 15;
        int lifeCount = 1;

        System.out.println("введите на каком месте закончили");
        Scanner scanner = new Scanner(System.in);
        int levelScore = scanner.nextInt();
        scanner.close();

        if (levelScore < 4){
            currentLevel ++;
            levelCoin = levelCoin + 10;
        }  else
        {
            lifeCount --;
        }
        System.out.println( " You' ve finfshed on score" + levelScore
        + " Your current levels is" + currentLevel +
                " Your coin levels is" + levelCoin +
                " You have " + lifeCount + "lifes");
    }
}
