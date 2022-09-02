package HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 6, 5, 6};
        int index = 0;
        int sum = 0;

        sum = getSum(array, sum);

        index = getIndex(array, sum);

        if (index < 0){
            System.out.println("Sorry there is no index here where the sum of the right numbers is equal to the sum of the left numbers!");
        } else {
            System.out.println("Index = " + index + " where the sum of the right numbers is equal to the sum of the left numbers");
        }
    }

    private static int getIndex(int[] array, int sum) {
        int half = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println((sum - array[i]) / 2);
            if (half == (sum - array[i]) / 2) {
                return i;
            }
            half += array[i];
        }
        return -1;
    }

    private static int getSum(int[] array, int sum) {
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}
