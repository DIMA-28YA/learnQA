package Lesson4;

import java.util.Scanner;

public class NestedExample9 {
    // В классе 21 студент, каждый сдал по 4 экзамена
    // (есть результаты по каждому экзамену), посчитать для каждого студента стедний балл
    public static void main(String[] args) {

        int numberOfStudents = 21;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);
        for (int currentStudent = 0; currentStudent < numberOfStudents; currentStudent++) {
            double total = 0;
            for (int currentTest = 0; currentTest < numberOfTests; currentTest++) {
                System.out.println("Enter the score of test # " + (currentTest + 1) + "of student # " + (currentStudent + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numberOfTests;
            System.out.println("Test average for student # " + (currentStudent + 1) + " is # " + average);
        }
    }
}
