package HomeWork_4;

public class Lesson1 {

    public static void main(String[] args) {

        // Написать программу которая находит минимальное значение в массиве.

        double[] number = {1, 100, 9, 23.4};

        double arrayElement = number[1];
        double minNumber = 0;
        for (int i = 0; i < number.length; i++) {
            double currentNumber = number[i];
            System.out.println(" Number # " + (i + 1) + " - " + currentNumber);
            minNumber = number[0];
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }

        }
        System.out.println(" Min number " + minNumber);

    }
    }

