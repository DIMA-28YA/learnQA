package IfElseYouTubePractice;

public class IfElseSwitch3 {
    public static void main(String[] args) {

        //Дано четырехзначное число. Определить равна ли сумма двух первых его цифр
        // сумме двух его последних цифр
        int main = 3553;
        int x1 = main/1000;
        int x2 = (main/100)%10;
        int x3 = (main/10)%10;
        int x4 = main%10;
        if  (x1 + x2 == x3 + x4){
            System.out.println("Сумма равна");
        }else
        System.out.print("Сумма не равна");
    }
}
