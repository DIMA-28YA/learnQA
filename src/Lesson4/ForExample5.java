package Lesson4;

public class ForExample5 {

    public static void main(String[] args) {

        String inputString = "Lesson 4";
        boolean isStringContainsA = false;

        for (int i = 0; i < inputString.length(); i++){

            char currentChar = inputString.charAt(i);
            System.out.println("Current char is  - " + currentChar);
            if (currentChar == 'A' | currentChar == 'a'){
                isStringContainsA = true;
                System.out.println("String contains letter a");
            }
        }
        System.out.println("String contains A: " + isStringContainsA);
    }
}
