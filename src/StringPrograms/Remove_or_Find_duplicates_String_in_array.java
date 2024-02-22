package StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Remove_or_Find_duplicates_String_in_array {

	
	    public static void main(String[] args) {

	        String[] stringArray = {"apple", "banana", "orange", "apple", "banana"};
	        String[] uniqueArray = removeDuplicates(stringArray);
	        
	        String[] stringArray1 = {"apple", "banana", "orange", "apple", "banana"};
	        findAndPrintDuplicates(stringArray1);

	        System.out.println("Original array: " + Arrays.toString(stringArray));
	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
	    }

	    public static String[] removeDuplicates(String[] array) {
	        // Use LinkedHashSet to maintain the order of elements while removing duplicates
	        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(array));

	        // Convert the set back to an array
	        return set.toArray(new String[0]);
	        
	        //===============2nd Concept to Count quantity of duplicate 

	    }
	    

	    public static void findAndPrintDuplicates(String[] array) {
	        // Use a HashMap to store the frequency of each element
	        HashMap<String, Integer> frequencyMap = new HashMap<>();

	        // Iterate through each element in the array
	        for (String element : array) {
	            // Update the frequency in the map
	            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
	        }

	        // Print elements with frequency greater than 1 (duplicates)
	        System.out.println("Duplicates in the array:");
	        for (HashMap.Entry<String, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
	            }
	        }
	        		
	    }
	}
	