package CyclesYouTubeHomeWork;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        //Одна штука некоторого товара стоит 20,4 тг.
        // Напечатать таблицу стоимости 1-n штук этого товара. Число n вводится с клавиатуры.

        System.out.println("введите количество");
        int amount = new Scanner(System.in).nextInt();
        double price = 20400;
         for (int i = 1; 0 < amount; i++){
             if (i > amount)
            break;
            System.out.println(i*price);
        }


    }
}
