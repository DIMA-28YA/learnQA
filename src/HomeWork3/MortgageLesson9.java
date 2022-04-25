package HomeWork3;


import java.util.Scanner;

public class MortgageLesson9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст жены ");
        int oldWomen = scanner.nextInt();



        if ( 18< oldWomen & oldWomen < 45){
            System.out.println("Ипотека жены удовлетворена");
        } else
            System.out.println( "Ипотека жены не удовлетворена");

        System.out.println("Введите возраст мужа ");
        int oldMan = scanner.nextInt();
        scanner.close();

        if ( 18< oldMan & oldMan < 45){
            System.out.println("Ипотека мужа удовлетворена");
        } else
            System.out.println( "Ипотека мужа не удовлетворена");
        }

    }
