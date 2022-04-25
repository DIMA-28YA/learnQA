package CyclesYouTubePractice;

import java.util.Scanner;

public class CyclesLesson {
    public static void main(String[] args) {
        // Найти среднее арифметическое всех целых чисел от а до в
        // значение вводится с клавиатуры В >= A

        int refresh = 2;
        int sum = 0;
        do {
            for (int i = 1; i <= 3;i++) {
                sum = sum + i; // sum += i - сокращение
            }
            System.out.println("Сумма = " + sum );
            System.out.println("Среднее арифметическое " + (sum/3));
            System.out.println("Завершить прогамму? ДА-1   НЕТ-2");
            refresh = new Scanner(System.in).nextInt();
        }while (refresh == 2);
    }
}
