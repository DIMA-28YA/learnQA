package ArrayYouTubeHomeWork;

public class ArrayHomeWork6 {
    public static void main(String[] args) {

        // Известны оценки ученика по 10 предметам. Определить минимальную и максимальную оценку.
        // Оценки хранятся в десятичном формате (3.5 - 4.8 и тд)

        double [ ] student = new double[10];
        double min = 5;
        double max = 0;

        for (int i = 0; i < student.length; i++) {
            student[i] = 3 + (Math.random() * 2);
            student[i] = (double) (Math.round(student[i]) * 100.0) / 100.0;

            if (student[i] < min) {
                min = student[i];
            }
            if (student[i] > max) {
                max = student[i];
            }

        }
        System.out.println("максимальная оценка " + max);
        System.out.println("минимальная оценка " + min);

    }
}
