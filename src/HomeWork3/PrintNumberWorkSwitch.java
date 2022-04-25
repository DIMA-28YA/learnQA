package HomeWork3;

import java.util.Scanner;

public class PrintNumberWorkSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        String name = "Name";
        switch (number) {
            case 1:
                name = "ONE";
                break;
            case 2:
                name = "TWO";
                break;
            case 3:
                name = "THREE";
                break;
            case 4:
                name = "FOUR";
                break;
            case 5:
                name = "FIVE";
                break;
            case 6:
                name = "SIX";
                break;
            case 7:
                name = "SEVEN";
                break;
            case 8:
                name = "EIGHT";
                break;
            case 9:
                name = "NINE";
                break;
            default:
                name = "OTHER";
        }
        System.out.println("Number " + name);
    }
}
