package Method_String_YouTube;

import java.util.Locale;

public class Method_ToLowerCase_String {
    public static void main(String[] args) {

        // toLowerCase все буквы в нижнем регистре
        // toUpperCase все буквы в верхнем регисте
        String str1 = "Study";
        String str2 = "Java";
        System.out.println(str1.toLowerCase(Locale.ROOT));
        System.out.println(str2.toUpperCase(Locale.ROOT));
    }
}
