package Palindrome;

import java.util.Locale;

public class PalidromeYouTube {
    public static void main(String[] args) {

        System.out.println(isPolindrome ("ABBA BBBB ABba"));
        System.out.println(isPolindrome ("ABBA 2222 AB':BA"));
        System.out.println(isPolindrome ("ABBA BBBkbkbkB ABba"));

    }
    public static boolean isPolindrome (String text){// метод возращаемого типа должен заканчиваться return
        // isPolindrome -> boolean
        //isPolindrome ("ABBA BBBB ABba") -> true
        //isPolindrome ("ABBA 2344 AB':ba") -> true
        //isPolindrome ("ABkkkdlkdBA BBBB ABba") -> false
        //StringBuffer - проверяем строку с обратной стороны ( в String нет revers)

        String s1 = text.toUpperCase().replaceAll("[^A-Za-z]", "");
        StringBuffer s2 = new StringBuffer(s1).reverse();
        boolean answer = true;
        for (int i = 0; i < s1.length(); i ++){
            if (s1.charAt(i) != s2.charAt(i)) {
                answer = false;
                break;
            }
        }

                // text - переменная
                // toUpperCase переводим все в один реестр (все буквы будут большие)
                // replaceAll(String regex ....) принимает регулярное вырадение и на что оно должно быть заменено
                // ("^A-Za-z", "") - в оставляем в нашем методе только буквы, а все остальные символы меняем на пустоту.



        return answer;


    }


}
