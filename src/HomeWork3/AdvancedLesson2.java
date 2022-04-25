package HomeWork3;

import java.util.Scanner;

public class AdvancedLesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Площадь куга ");
        int areaCircle = scanner.nextInt();
        System.out.println("Площадь квадрата ");
        int areaSquare = scanner.nextInt();
        scanner.close();

        if (areaCircle>areaSquare){
            System.out.println("Квадрат поместится в круг");
        } else if (areaCircle<areaSquare){
            System.out.println("Круг поместится в квадрат");
        }
            }



    }

