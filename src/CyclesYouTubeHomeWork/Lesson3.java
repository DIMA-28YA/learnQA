package CyclesYouTubeHomeWork;

import java.util.Scanner;

public class Lesson3 {

    //Напечатать таблицу умножения на число n. Число n вводится с клавиатуры.
    // Проверить условие n не меньше 1 и не больше 9.
    public static void main(String[] args) {
        int refresh = 2;
        do {
        System.out.println("Введите число");
        int n = new Scanner(System.in).nextInt();
            for (int i = 0; i < 10; i ++){
                if (1 <= n && n <= 9)
                System.out.printf("%s * %s = %s \n9",i,n,i*n);
            }
        System.out.println("Вы ввели не верное число \nЧисло должно быть от 1 до 9 \nЗавершить прогамму? ДА-1   НЕТ-2");
            refresh = new Scanner(System.in).nextInt();
    } while (refresh == 2);

        }
    }

