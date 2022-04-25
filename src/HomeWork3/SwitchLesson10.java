package HomeWork3;

import java.util.Scanner;

public class SwitchLesson10 {
    public static void main(String[] args) {
        System.out.println("введите номер пальца 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int fungerNumber = scanner.nextInt();

        String name = null;
        switch (fungerNumber) {
            case 1:
                name = "Большой";
                break;
            case 2:
                name = "Указательный";
                break;
            case 3:
                name = "Средний";
                break;
            case 4:
                name = "Безымянный";
                break;
            case 5:
                name = "Мизинец";
                break;
        }
            System.out.println( "Это " + name);


        }

    }

