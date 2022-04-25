package CyclesYouTubeHomeWork;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        //Напечатать таблицу умножения на число n. Число n вводится с клавиатуры.
        System.out.println("Введите число");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <= 10; i ++){

            System.out.printf("%s * %s = %s\n",i,n, i*n);

        }

    }
}
