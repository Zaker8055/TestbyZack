package StringPrograms;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_Sort_ASC_and_DESC {

	 // Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        int[] arr1 = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Integer[] arr2 = { 13, 7, 6, 45, 21, 9, 101, 102 };
        String []arr3= {"Zaker","Pathan","Khan","Sadeqa","Khanam"};
 
        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);
       
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));
        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        
        Arrays.sort(arr1, 1, 5);
       
        System.out.println("Modified arr1[] : "
                + Arrays.toString(arr1));
        
        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arr2, Collections.reverseOrder());
       
        System.out.println("Modified arr2[] : "
                + Arrays.toString(arr2));
        
        Arrays.sort(arr3);
        System.out.println("Modified arr3[] : "+Arrays.toString(arr3));
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println("Modified arr3[] : "+Arrays.toString(arr3) + " :Reverse Order");
		
	}

}
