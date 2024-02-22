package Sample;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main (String args[]) {
		
		//Count("Zaker Pathan");
		//reverseString("Zaker");
		//reverseeachwordofstring("I am Zaker Pathan Engineer IT ");
		reverseInteger(12311);
	}
	public static void reverseInteger(int n) {
		
		int sum=0;
		
		while (n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
		
	}
	
	
	
	public static void reverseeachwordofstring(String s) {
		
		String[] s1=s.split(" ");
		String ReverseString="";
		
		for (String w:s1) {
			
			String Rw="";
			
			for (int i=w.length()-1;i>=0;i--) {
				
				Rw=Rw+w.charAt(i);
				
			}
			ReverseString=ReverseString+Rw+" ";
		}
		System.out.println(ReverseString);
	}
		
	public static void reverseString(String str) {
		
		
		String rev="";
		
		for (int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
	}
	
	public static void Count(String Name) {
		
	Map<Character, Integer> charmap=new HashMap<Character, Integer>();
	
	for (char c:Name.toCharArray()) {
		
		if(charmap.containsKey(c)) {
			
			charmap.put(c,charmap.get(c)+1);
		}
		else
		{
			charmap.put(c,1);
			
		}
	}
	System.out.println(Name +" :"+charmap);

	}

}
