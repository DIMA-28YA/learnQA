package IfElseYouTubePractice;

public class IfElseSwitch1 {
    public static void main(String[] args) {
        // Дано трехзначное число. Определить, какая из его цифр больше?
        int main = 948;
        int x1 = main / 100;
        int x2 = (main / 10) % 10;
        int x3 = main % 10;
        if (x1 > x2 && x1 > x3) {
            System.out.println("Первое число самое большое");
        } else if (x2 > x1 && x2 > x3) {
            System.out.println("Второе число самое большое");
        } else if (x3 > x1 && x3 > x2) {
            System.out.println("Третье число самое большое");
        }
    }
}
