package IfElseYouTubePractice;

public class IfElseSwitch6 {
    public static void main(String[] args) {
        // Известны две скорости: одна в километрах в час, другая в метрах в секунду.
        // Выяснить, какая из скоростей больше?
        double kmh = 72;
        double mc = 20;
        mc = mc*3.6;
        if (mc > kmh){
            System.out.println("м/с больше км/ч");
        }
        else if (kmh>mc){
            System.out.println("км/ч больше м/с");}
        else {
            System.out.println("скорость равна");
        }


    }
}
