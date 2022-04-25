package YouTube;

public class WhileBreak {
    public static void main(String[] args) {

        // Таблица умножения на 1 число.

        int i = 1;
        int x = 3;
        while (i <= 9){
            System.out.printf("%s * %s = %s \n", i, x, i * x);
            i++;
            if  (i == 5){
                break;
            }
        }

    }
}
