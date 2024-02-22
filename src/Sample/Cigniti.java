package Sample;

import java.util.HashMap;
import java.util.Map;

public class Cigniti {

	public static void main(String[] args) {

    String name="Zaker Pathan";
    
    Map<Character,Integer> charmap=new HashMap<Character,Integer>();
    
    for (char c:name.toCharArray()) {
    	
    	if(charmap.containsKey(c)) {
    		
    		charmap.put(c, charmap.get(c)+1);
    		
    	}
    	else
    	{
    		charmap.put(c, 1);
    	}
    }
    System.out.println(name +"::"+charmap);
    
	}

}
