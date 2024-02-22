package StringPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program_Largest_and_Smallest_Number_in_Array {

	public static void main(String[] args) {

		int number[]= {10,29,6,6,6,88,86,605,567,99,9};
		
		int largest =number[0];
		int smallest=number[0];
		
		for (int i=1;i<number.length;i++) {
			
			if (number[i]>largest) {
				
				largest=number[i];
			}
			else if (number[i]<smallest) {
				smallest=number[i];
			}
			
			
		}
		System.out.println("Given Number in array is " + Arrays.toString(number));
		System.out.println("Smallest Number in array is ::" +smallest);
		System.out.println("Largest Number in array is ::" +largest);
	}

}
