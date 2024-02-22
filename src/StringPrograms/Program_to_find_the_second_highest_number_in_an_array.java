package StringPrograms;

import java.util.Arrays;

public class Program_to_find_the_second_highest_number_in_an_array {

	public static void main(String[] args) {
        int[] numbers = {10,}; // Replace this array with your numbers

        int secondHighest = findSecondHighest(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Second-highest number: " + secondHighest);
    }

    public static int findSecondHighest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; // Indicates an error or no second-highest value
        }

        int highest = arr[0];//Integer.MIN_VALUE;
        int secondHighest =arr[0];// Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        return secondHighest;
    }
}
