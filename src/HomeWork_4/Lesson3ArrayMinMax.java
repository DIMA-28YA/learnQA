package HomeWork_4;

import java.util.Arrays;

public class Lesson3ArrayMinMax {
    public static void main(String[] args) {

        // Написать программу которая сортирует массив от минимума в максимум.

        int[] arr = {2, 3, 6, 22, 51, 4, -7, 1};
        System.out.println("Массив  не отсортирован" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++)
            if (arr [j]> arr [j + 1]) {
                int temp = arr[j];
                arr [j] = arr [j+1];
                arr [j + 1] = temp;
            }
        }
        System.out.println("Массив  отсортирован" + Arrays.toString(arr));

    }

}

