package HomeWork3;

import java.util.Scanner;

public class PrintNumberWordIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();
        scanner.close();
        String title;
        if (number == 1){
            title = "ONE";
        } else if (number == 2){
            title = "TWO";
        } else if (number == 3){
            title = "Three";
        }else if (number == 4){
            title = "Four";
        }else if (number == 5){
            title = "Five";
        }else if (number == 6){
            title = "Six";
        }else if (number == 7){
            title = "Seven";
        }else if (number == 8){
            title = "Eight";
        }else if (number == 9){
            title = "Nine";
        } else {
            title = "Other";
        }
        System.out.println(" Number " + title);


        }
    }

