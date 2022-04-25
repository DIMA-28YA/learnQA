package HomeWork3;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ( "Введите число А " );
        double a = scanner.nextDouble();
        System.out.println( "Введите число В ");
        double b = scanner.nextDouble();

        double x;

        if (a==0.0){
            x = 0.0;}
        if (b ==0.0){
            x = 0.0;}
        x = -b/a + 0.0;

        System.out.println("Число Х = " + x);
        }

    }

