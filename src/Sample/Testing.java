package Sample;

import java.util.HashMap;
import java.util.Map;

public class Testing {
	
	public static void main(String args[]) {
	
		String s="Zaker pathan";
		String[] word=s.split(" ");
		String rev="";
		
		for(String s1:word) {
		
			String rev1="";
		for(int i=s1.length()-1;i>=0;i--) {
			
			rev1=rev1+s1.charAt(i);
		}
		rev =rev +rev1 +" ";
				
	}
		System.out.println(rev);
}
}