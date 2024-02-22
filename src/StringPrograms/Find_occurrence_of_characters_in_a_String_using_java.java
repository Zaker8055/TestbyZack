package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Find_occurrence_of_characters_in_a_String_using_java {

public static void main(String[] args) {
		
		getCharCount("Zadsfedswgfjjjjjkk");
		

	}		
	
	public static void getCharCount(String name) {
		Map<Character ,Integer> charmap=new HashMap<Character ,Integer>();
		
		//char strArray[]= name.toCharArray();
		
		for (char c:name.toCharArray()) {
			
			if (!String.valueOf(c).isBlank()) {
			
			if (charmap.containsKey(c)) {
				
				 charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c, 1);
			}
			}
		}
		System.out.println(name +":  "+ charmap);
		
		//Advance Console Output optional
		for (Map.Entry<Character, Integer> entry : charmap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Occurrence: " + entry.getValue());
       }
		
		
		
	}

	}
