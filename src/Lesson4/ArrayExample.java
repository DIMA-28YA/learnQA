package Lesson4;


public class ArrayExample {
    public static void main(String[] args) {

        // Кассир написал программу которая получает с клавиатуры задание количество цен и
        //посчитывает сумму

                        //  0    1    2    3
        double[] prices = {4.2, 5.3, 4.5, 5.4};
        double total = 0.0;

        double arrayElement = prices[1];

        System.out.println("Array element with index 1 " + arrayElement);
        for (int i = 0; i < prices.length; i++) {
            double currentCost = prices[i];
            System.out.println("The cost of item #" + (i + 1) + " is " + currentCost);

            total = total + currentCost;

        }

        System.out.println("Your total cost is " + total);
    }
}
