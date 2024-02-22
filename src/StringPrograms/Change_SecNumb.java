package StringPrograms;
import java.util.Arrays;
import java.util.Comparator;

public class Change_SecNumb {


	    public static void main(String[] args) {
	        int[] input = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
	        rearrangeArray(input);
	        System.out.println("Output: " + Arrays.toString(input));
	    }

	    private static void rearrangeArray(int[] arr) {
	        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

	        Arrays.sort(boxedArray, new CustomComparator());

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = boxedArray[i];
	        }
	    }

	    static class CustomComparator implements Comparator<Integer> {
	        @Override
	        public int compare(Integer a, Integer b) {
	            // Custom sorting logic based on the given pattern
	            if (a % 2 == 0 && b % 2 != 0) {
	                return -1;
	            } else if (a % 2 != 0 && b % 2 == 0) {
	                return 1;
	            } else {
	                return a - b;
	            }
	        }
	    }
	}
