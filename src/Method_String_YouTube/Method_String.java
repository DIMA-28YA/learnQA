package Method_String_YouTube;

public class Method_String {
    public static void main(String[] args) {
        // Вывод каждого символа на экран.
        // посчітаем сколько у на букв "а"

         String str1 = "I'a study Java";
         int countA = 0;
         for (char i : str1.toCharArray()){
             //System.out.println(str1);
             if (i == 'a'){
                 countA++;
             }
         }
        System.out.println(countA);

    }
}
