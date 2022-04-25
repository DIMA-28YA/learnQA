package CyclesYouTubePractice;

import java.util.Scanner;

public class CyclesLesson1 {
    public static void main(String[] args) {
        // Найти среднее арифметическое всех целых чисел от а до в
        // значение вводится с клавиатуры В >= A
        int refresh = 2;


        do {
            int sum = 0;
            System.out.println("Ведите начальное значение ");
            int start = new Scanner(System.in).nextInt();
            System.out.println("Ведите конечное значение ");
            int finish = new Scanner(System.in).nextInt();
            int j = 0;
            for (int i = start; i <= finish ;i++) {
                sum = sum + i; // sum += i - сокращение
                j++; // считает количество чисел
            }
            System.out.println("Сумма = " + sum );
            System.out.println("Среднее арифметическое " + ((double)sum/j)); // просвоили тип дабл для суммы
            System.out.println("Завершить прогамму? ДА-1   НЕТ-2");
            refresh = new Scanner(System.in).nextInt();
        }while (refresh == 2);
    }
}

