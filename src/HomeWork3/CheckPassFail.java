package HomeWork3;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число ");
        int mark = scanner.nextInt();

        String title;
        if (50 <= mark) {
            title = "PASS ";
        } else {
            title = "FAIL ";
        }
        System.out.println("DOOL " + title);
    }
}
