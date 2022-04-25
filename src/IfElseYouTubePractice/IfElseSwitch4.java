package IfElseYouTubePractice;

public class IfElseSwitch4 {
    public static void main(String[] args) {

        //Дано трехзначное число. Определить является ли сумма его цифр двузначным числом;

        int main = 154;
        int x1 = main/100;
        int x2 = (main/10)%10;
        int x3 = main%10;
        int sum = x3 + x2 + x1;
        if (sum >=10 || sum <= -10){
            System.out.println("Число являеться двухзначным");
        }
        else
        System.out.println("Число не являеться двухзначным");
    }
}
