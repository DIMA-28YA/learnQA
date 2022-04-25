package HomeWork_4;

public class PalindromLesson4 {
    public static void main(String[] args) {


        String word = "ABBA";
        char[] arrayOfChars = word.toCharArray();
        System.out.println(istPalindrom(arrayOfChars));

}       public static boolean istPalindrom(char[] word) {
        boolean palindrom = false;
        if(word.length%2 == 0){
            for(int i = 0; i < word.length/2-1; i++){
                if(word[i] != word[word.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }else{
            for(int i = 0; i < (word.length-1)/2-1; i++){
                if(word[i] != word[word.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}
