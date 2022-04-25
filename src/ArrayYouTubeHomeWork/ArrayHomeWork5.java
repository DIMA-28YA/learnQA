package ArrayYouTubeHomeWork;

import java.util.Scanner;

public class ArrayHomeWork5 {
    public static void main(String[] args) {

        // Известна масса каждого предмета, загружаемого в автомобиль. Определить общую массу груза.
        // Проверить хватит ли грузоподъёмности автомобиля для перевозки груза.
        // Грузоподъемность вводится с клавиатуры. Известно, что количество загружаемых предметов – 5шт
        System.out.println("Введите грузоподъемность авто");
        int sumAuto = new Scanner(System.in).nextInt();

        int [] mas = new int[5];
        int sum = 0;

        for (int i = 0; i < mas.length; i++){
            mas[i] =(int) (Math.random()*100);
            sum += mas[i];

        }if (sum > sumAuto){
            System.out.println("Привешение грузоподъемности");
        }
        System.out.println("Грузоподъемность " + sumAuto);
        System.out.println("Масса груза " + sum);

    }
}
