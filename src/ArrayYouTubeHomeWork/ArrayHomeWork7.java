package ArrayYouTubeHomeWork;

public class ArrayHomeWork7 {
    public static void main(String[] args) {

// В массиве хранятся сведения об оценках 25 учеников по Информатике.
// Определить количество неуспевающих учеников, троечников, ударников и отличников.
// А также выяснить каких учеников больше.

        int[] student = new int[25];

        int gradeLow = 3;
        int gradeMidl = 4;
        int gradeHigh = 5;
        int sumLow = 0;
        int sumMidl = 0;
        int sumHigh = 0;

        for (int i = 0; i < student.length; i++){
            student[i] = 2+(int) (Math.random()*4);
            if(student[i] == gradeLow) {
                sumLow++;
            } else if (student[i] == gradeMidl) {
                sumMidl++;
            } else if (student[i] == gradeHigh){
                sumHigh++;}
        }
        if (sumLow > sumMidl && sumLow > sumHigh){
                System.out.println("Троичнеков больше всех");
            } else if (sumMidl > sumLow && sumMidl > sumHigh)
            {
                System.out.println("Ударников больше всех");
            }else if (sumHigh > sumLow && sumHigh > sumMidl) {
                System.out.println("Отличниклов больше всех");
            }
        System.out.println("Количество троичнеков " + sumLow);
        System.out.println("Количество ударников " + sumMidl);
        System.out.println("Количество отличников " + sumHigh);

    }
}
