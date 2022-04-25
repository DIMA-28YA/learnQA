package CyclesYouTubeHomeWork;

import java.util.Scanner;

public class Lessons8 {
    public static void main(String[] args) {

        // Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривну
        // по текущему курсу (значение курса вводится с клавиатуры).

        System.out.println("Введите сумму");
        int rate = new Scanner(System.in).nextInt();
        if (rate > 20) {
            System.out.println("Сумма должна быть не выше 20 $");
        }else {
            double sum = rate * 30.23;
            System.out.println("Ваша сумма " + sum);
        }
    }
    }

