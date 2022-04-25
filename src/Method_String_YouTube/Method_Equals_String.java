package Method_String_YouTube;

public class Method_Equals_String {
    // equals - сравнивание строки с учетом регистра. (маленькие и большие буквы не равны)
    // str1.equalsIgnoreCase(str2) - сравнивает строки без учета регистра (маленькие и большие буквы равны)
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "Java";
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Равны");
        }else
            System.out.println("Не равны");

    }
}
