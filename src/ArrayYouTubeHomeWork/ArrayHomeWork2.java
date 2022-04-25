package ArrayYouTubeHomeWork;

public class ArrayHomeWork2 {
    public static void main(String[] args) {
        // Известны оценки по физике каждого ученика двух классов. Определить среднюю оценку в каждом классе,
        // и в каком классе успеваемость лучше. Количество учащихся в каждом классе – 15 учеников

        int class1[] = new int[14];
        int class2[] = new int[14];
        int sumClass1 = 0;
        int sumClass2 = 0;
        int studentClass1 = 0;
        int studentClass2 = 0;

        for (int i = 0; i < class1.length; i++) {
            class1[i] = 2 + (int) (Math.random() * 4);
            sumClass1 += class1[i];
            studentClass1++;
        }

        for (int i = 0; i < class2.length; i++) {
            class2[i] = 2 + (int) (Math.random() * 4);
            sumClass2 += class2[i];
            studentClass2++;
        }

        if (sumClass1/studentClass1 < sumClass2/studentClass2){
            System.out.println("Во втором классе успеваемость лучше");
        }else if (sumClass1/studentClass1 >  sumClass2/studentClass2) {
            System.out.println("В первом классе успеваемость лучше");
        } else if (sumClass1/studentClass1 ==  sumClass2/studentClass2){
            System.out.println("Успеваемость одинаковая");
        }

        System.out.println("Средняя оценка в первом классе " + sumClass1/studentClass1);
        System.out.println("Средняя оценка во втором классе " + sumClass2/studentClass2);
    }
}
