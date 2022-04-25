package IfElseYouTubePractice;

public class IfElseSwitch5 {
    public static void main(String[] args) {
        // Дано трехзначное число. Выяснить, является ли оно палиндромом ("перевертышем"), т. е. таким числом,
        // десятичная запись которого читается одинаково слева направо и справа налево.
        // Вывести это число в столбик

        int mine= 343;
        int x1 = mine/100;
        int x2 = (mine/10)%10;
        int x3 = mine%10;

        if (x1 == x3){
            System.out.println("Строка палиндромом");
        }else
            System.out.println("Строка не палиндромом");



    }

}
