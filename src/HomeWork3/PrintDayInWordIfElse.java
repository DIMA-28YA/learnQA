package HomeWork3;

import java.util.Scanner;

public class PrintDayInWordIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int number = scanner.nextInt();
        scanner.close();
        String title;
        if (number == 1) {
            title = "Monday";
        }
        else if  (number == 2) {
            title = "Tuesday";
        }
        else if (number == 3) {
            title = "Wednesday";
        }
        else if (number == 4) {
            title = "Thursday";
        }
        else if (number == 5) {
            title = "Friday";
        }
        else if (number == 6) {
            title = "Saturday";
        }
        else if (number == 7) {
            title = "Sunday";
        } else {
            title = "Not a valid day";
        }
        System.out.println("День недели " + title);

    }
}
