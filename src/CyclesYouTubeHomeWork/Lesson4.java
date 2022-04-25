package CyclesYouTubeHomeWork;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        //Найти сумму чисел от m до n (m и n вводятся с клавиатуры).
        // При этом сделать проверку: n,m  в пределах от -256 до 256

        System.out.println("Введите число M");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Ведите число N");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = n; i <= m; i++)
            sum = sum + i;
        if (m >= n && m < 256 && m > -256) {
            System.out.println("сумма чисел от M до N " + sum);
        }
        for (int i = m; i <= n; i++)
            sum = sum + i;
        if (n > m && n < 256 && n > -256) {
            System.out.println("сумма чисел от M до N " + sum);

        }
    }
}