package IfElseYouTubePractice;

import java.util.Scanner;

public class IfElseSwitch7 {
    public static void main(String[] args) {

        // Известен вес боксера-любителя. Известно, что вес таков, что боксер может быть
        // отнесен к одной из трех весовых категорий:
        // 1) легкий вес — до 60 кг;
        // 2) первый полусредний вес — до 64 кг;
        // 3) полусредний вес — до 69 кг.
        // Определить, в какой категории будет выступать данный боксер.

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int weight = scanner.nextInt();
        scanner.close();
        if (0 < weight && weight < 60) {
            System.out.println("легкий вес");
        }
        else if (60 < weight && weight < 64) {
            System.out.println("первый полусредний вес");
        }
            else if (64 < weight && weight < 69) {
            System.out.println("полусредний вес");
        }
        }
    }

