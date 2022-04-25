package ArrayYouTubeHomeWork;

import java.util.Scanner;

public class ArrayHomeWork4 {
    public static void main(String[] args) {

        // Дан массив целых чисел. Размер массива пользователь вводит с клавиатуры.
        // Выяснить верно ли, что сумма элементов массива есть четное число

        System.out.println("Введите размер массива");
        int nub = new Scanner(System.in).nextInt();
        int[] mas = new int[nub];
        int sumNub = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            sumNub += mas[i];
        }
        if (sumNub % 2 == 0) {
            System.out.println("Сумма массива четная");
        } else {
            System.out.println("Сумма массива не четная");


        }
        System.out.println("Сумма массива " + sumNub);
    }
}
