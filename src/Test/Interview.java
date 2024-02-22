package Test;

import java.util.HashMap;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {


		String s = "CAT PEN PAPER CAT TAP CAT PEN";
		String []s1=s.split(" ");
		
		Map<String,Integer> charmap=new HashMap<String,Integer>();
		
		for(String c:s1) {
			
			if(charmap.containsKey(c)) {
				
				charmap.put(c, charmap.get(c)+1);
			}
			else
			{
				charmap.put(c, 1);
			}
		}
		
		System.out.println(s+" :"+charmap);

	}

}
