package HomeWork3;

import java.util.Scanner;

public class ManagerBonusLesson8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество продаж ");
        int sale = scanner.nextInt();
        scanner.close();

        String titel = null;
        if (sale > 10){
            titel = "Вы получили бонус";
        }else if (sale < 10){
            int x = 10 - sale;
            titel = "Вам осталось до бонуса " + x;
        }

        System.out.println(titel);




    }
}
