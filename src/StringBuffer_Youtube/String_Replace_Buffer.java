package StringBuffer_Youtube;

public class String_Replace_Buffer {
    public String_Replace_Buffer(String str) {
    }

    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer("PKGT");
        str1.replace(0,2,"GT");
        System.out.println(str1);

    }
}
