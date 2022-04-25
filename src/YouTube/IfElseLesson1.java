package YouTube;

public class IfElseLesson1 {
    public static void main(String[] args) {
        // Дано трехзначное число, определить равны ли числа
        int main = 456;
        int x1 = main/100; // 4
        int x2 = (main/10)%10; // 5
        int x3 = main%10; // 6
        if (x1 == x2 && x2 == x3){
            System.out.println(" Все числа одинаковые ");
        }
        else
            System.out.println("Числа не равны");
    }
}
