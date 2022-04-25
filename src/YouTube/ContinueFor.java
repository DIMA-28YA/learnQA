package YouTube;

public class ContinueFor {
    public static void main(String[] args) {
        // таблица умножения на одно число. Выводим результат где,
        // умножение происходит только на четные числами. С помощью continue
        int x = 5;
        for (int i = 1; i <= 10; i ++){
            if (i%2 != 0){
                continue;
            }
            System.out.printf("%s * %s = %s \n",i , x, i * x);
        }
    }
}
