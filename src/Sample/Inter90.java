package Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inter90 {

	public static void main(String[] args) {

   /*
		List<Integer> list=Arrays.asList(10,20,13,3,213,11,1,2,21);
        
        Integer result= list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        
        System.out.println(result);
        
*/
		
		
		List<Integer>  input=Arrays.asList(10,20,30,40,50,60);
		
		Integer op=input.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(op);
		System.out.println(input);
		}
		
		
	}
	
