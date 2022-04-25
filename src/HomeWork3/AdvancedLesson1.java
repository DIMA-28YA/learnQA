package HomeWork3;

import java.util.Scanner;

public class AdvancedLesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма покупки ");
        int amount = scanner.nextInt();
        scanner.close();

        double sale = 0;
        if (amount < 1000){
            sale = amount;
            System.out.println("Скидки нет");
        }

            if (amount >= 1000){
                sale = amount / 1.15;
        }
        System.out.println("Сумма покупки " + sale);
        }
    }

