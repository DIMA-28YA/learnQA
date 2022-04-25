package HomeWork3;

import java.util.Scanner;

public class ManagerLesson7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Введите количество продаж ");
        int sale = scanner.nextInt();
        scanner.close();

        int manager = 0;
        if (sale > 10){
            manager = 250;
        }
        int salary = 1000 + manager; 
        System.out.println("Зарплата менеджера = " + salary);
    }
}
