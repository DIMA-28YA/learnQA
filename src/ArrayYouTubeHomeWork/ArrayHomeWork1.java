package ArrayYouTubeHomeWork;

public class ArrayHomeWork1 {
    public static void main(String[] args) {

        // В области 12 районов. Известны количество жителей (в тысячах человек) и площадь (в км2) каждого района.
        // Определить среднюю плотность населения по области в целом.

        double km []= new double[11];
        double  people [] = new double[11];
        double sumKm  = 0;
        double sumPeople = 0;

        for (int i = 0; i < km.length; i ++){
            km[i] = Math.random()*100;
            sumKm += km[i];
        }
        for (int i = 0; i < people.length; i ++) {
            people[i] = Math.random() * 10;
            sumPeople += people[i];
        }

        System.out.println("Общая сумма площади " + sumKm);
        System.out.println("Общая численность населения " + sumPeople);
        System.out.println("Плотность  населения " + sumKm/sumPeople);


    }
}
