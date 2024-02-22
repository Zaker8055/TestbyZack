package Sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PracticeProgram {

	public static void main(String[] args) {
	
		String input="Zaker Pathan";
		
		Map<Character,Integer> charmap=new HashMap<Character,Integer>();
		
		for(char c:input.toCharArray()) {
			
			if(!String.valueOf(c).isBlank()) {
			if(charmap.containsKey(c)) {
				
				charmap.put(c,charmap.get(c)+1);
			
			}
			else {
				
				charmap.put(c, 1);
			}
			
		}
		}
		System.out.println(input+""+charmap);
	}}


