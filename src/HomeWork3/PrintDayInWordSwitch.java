package HomeWork3;

import java.util.Scanner;

public class PrintDayInWordSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int number = scanner.nextInt();
        scanner.close();
        String name = "Name";
        switch (number) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Not a valid day";
        }
        System.out.println("День недели " + name);
    }
}
