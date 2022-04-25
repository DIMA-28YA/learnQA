package CyclesYouTubeHomeWork;

import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {

        // Найти произведение всех целых чисел от a до b
        // (значения a и b вводятся с клавиатуры; b больше либо равно a)

        System.out.println("Введите число А");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите число В");
        int b = new Scanner(System.in).nextInt();
        int sum = 1;
        for (int i = a; i <= b; i++) {
            sum *=i;

        }
            System.out.println(sum);

        }
    }
