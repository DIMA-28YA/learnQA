package YouTube;

public class IfElseLesson3 {
    public static void main(String[] args) {
        // Измерить рост трех человек ( 1й - в миллиметрах, 2-й сантиметрах, 3-й в метрах)
        // и найти максимальный рост человека
        // определить одинаковый ли рост у 3-х человек
        double chel1 = 1730;// mm
        chel1 = chel1 / 10;
        double chal2 = 178;//cm
        double chal3 = 1.79;//metr
        chal3 = chal3 * 100;
        if (chel1 == chal2 && chal2 == chal3) {
            System.out.println("рост всех одинаков");
        } else {
            if (chel1 > chal2 && chel1 > chal3) {
                System.out.println("Человек 1 самый высокий");
            }
            if (chal2 > chel1 && chal2 > chal3) {
                System.out.println("Человек 2 самый высокий");
            }
            if (chal3 > chal2 && chal3 > chel1) {
                System.out.println("Человек 3 самый высокий");
            }
        }
    }

    }

