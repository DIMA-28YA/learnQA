package HomeWork3;

import java.util.Scanner;

public class AdvancedLesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A ");
        int a = scanner.nextInt();
        System.out.println("Введите число B ");
        int b = scanner.nextInt();
        scanner.close();

        if (b%a ==0){
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }







        }
    }

