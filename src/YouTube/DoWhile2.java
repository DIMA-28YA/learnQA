package YouTube;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        // зацикливания программы.

        boolean t= true;
        do {
            int i = 1;
            int x = 3;
            while (i <= 9) {
                System.out.printf("%s * %s = %s \n", i, x, i * x);
                i++;
                if (i == 5) {
                    break;
                }
            }
                System.out.println("Хотите продолжить? Да - 1: нет - 2");
                int ref = new Scanner(System.in).nextInt();
                if (ref == 2) {
                    t = false;
                }
            }
            while (t) ;


    }
}
