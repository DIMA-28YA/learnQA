package IfElseYouTubePractice;

public class IfElseSwitch2 {
    public static void main(String[] args) {
        //Определить, является ли число A делителем числа B? И наоборот. (Получить два ответа.)
        int a = 3;
        int b = 6;
        if(a%b==0){
            System.out.println(" В делиться на А");
        }
        if (b%a == 0){
            System.out.println(" А делиться на В");

        }
        else
            System.out.println("Не делиться");

    }
}
