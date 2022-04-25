package CyclesYouTubeHomeWork;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {

        //Найти среднее арифметическое всех целых чисел от a до b
        // (значения a и b вводятся с клавиатуры; a меньше либо равно 200)

        System.out.println("Введите число А");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите число В");
        int b = new Scanner(System.in).nextInt();

        int sum = 0;
        int j = 0;
            for (int i = a; i <= b; i++) {
                if (i > 200) {
                    System.out.println("Значение должно быть меньше либо равно 200");
                    break;
                }
                sum += i;
                j++;
            }
            for (int i = b; i <= a; i++) {
                sum += i;
                j++;
            }

            System.out.println("Сумма = " + sum / j);

    }
}


