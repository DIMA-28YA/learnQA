package ArrayYouTubeHomeWork;

public class ArrayHomeWork3 {
    public static void main(String[] args) {

        // Известен возраст (в годах в виде 14,5 лет и т. п.) каждого ученика двух классов.
        // Определить средний возраст учеников каждого класса. В каждом классе учатся 20 человек

        double[] class1 = new double[19];
        double[] class2 = new double[19];
        double sumAdgClass1 = 0;
        double sumAdgClass2 = 0;
        int j = 0;
        int a = 0;

        for (int i = 0; i < class1.length; i++) {
            class1[i] = 13 + Math.random() * 2;
            sumAdgClass1 += class1[i];
            j++;
        }

        for (int i = 0; i < class2.length; i++) {
            class2[i] = 13 + Math.random() * 2;
            sumAdgClass2 += class2[i];
            a++;

        }

        java.text.DecimalFormat df= new java.text.DecimalFormat("#.###");
        double d = sumAdgClass1;
        System.out.println("Средний возвраст в первом классе");
        System.out.println(df.format(sumAdgClass1/j));
        double b = sumAdgClass2;
        System.out.println("Средний возвраст во втором классе");
        System.out.println(df.format(sumAdgClass2/a));

    }
}
