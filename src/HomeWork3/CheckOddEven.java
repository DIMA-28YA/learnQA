package HomeWork3;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число");
        int number = scanner.nextInt();
        String title;
        if (number % 2 == 0){
            title = "Odd Number";
        } else {
            title = "Even Number";
        }
            System.out.println("BYE " + title);
        }
    }

