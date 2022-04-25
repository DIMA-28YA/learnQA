package ArrayYouTubePractice;

import java.util.Arrays;

public class ArrayYouTubePractice1 {
    public static void main(String[] args) {
         // В ведомости указана зарплата, выплаченная каждому из сотрудников фирмы за месяц.
        // Определить общую сумму выплаченных по ведомости денег.
        // Определить максимальную и минимальную зарплату в фирме. Известно, что в фирме работает 30 человек.

        int salary [] = new int [30];
        int min = 100000;// минимальная зарплата
        int max = 0; // максимальная зарплата
        int sum = 0;
        for (int i = 0; i < salary.length; i++){
            salary[i] = (int) (Math.random()*500)+200; // зарплата сотрудникам
            sum += salary[i]; // общая сумма
            if (salary[i] < min) {min = salary[i];}//(мин зарплата) присваиваем минимальное значение переменной min
        if (salary[i] >max ) {max = salary[i];} //(мах зарплата) присваиваем максимальное значение переменной max
        }
        System.out.println(Arrays.toString(salary));
        System.out.println("Итого " + sum);
        System.out.println("Минимальная заплата " + min);
        System.out.println("Максимальная зарплата " + max);


    }

}
