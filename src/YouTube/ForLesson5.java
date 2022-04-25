package YouTube;

public class ForLesson5 {
    public static void main(String[] args) {
        // таблица умножения на одно число
        int x = 5;
        int tmp;
        for (int i = 1; i <= 9; i ++){
            tmp = x * i;
            System.out.printf("%s * %s = %s \n",i , x, tmp); // вместо tmp можно написать i * x
        }
    }
}
    // int x = 5;
       // for (int i = 1; i <= 9; i ++){
         //       System.out.printf("%s * %s = %s \n",i , x, i * x);