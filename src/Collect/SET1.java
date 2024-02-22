package Collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SET1 {

	public static void main(String[] args) {
		
		
		final Map<Integer,String> charmap=new HashMap<>();
		
		charmap.put(1, null);
		charmap.put(2, null);
		charmap.put(null, null);
		charmap.put(null, null);
		charmap.put(null, null);
		charmap.put(null, null);
		
		
		
		System.out.println(charmap);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public void prog() {
		int arr[]= {11,23,65,788,900,890};
		int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
               // sum += num;
            	sum=sum+num;
            }
        }
        System.out.println(sum);
	}
        
	}
	
