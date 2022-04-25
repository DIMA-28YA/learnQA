package String_Buffer_YouTube_Practice;

public class Lesson1  {
    public static void main(String[] args) {
         //  из слова программа путем "вырезок" и "склеек" его букв получить слова грамм и мама.

        StringBuffer str1 = new StringBuffer("Программа");
        // str1.delete(0,3).delete(5,6); - слово грамм
        // str1.delete(0,7).append("ма"); - слово мама
        System.out.println(str1);

    }
}
