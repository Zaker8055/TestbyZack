package StringPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString_EachWords {

	public static void main(String[] args) {
	//1st Way
	String str1="I Love INDIA & America66g66r5";
	String[] word=str1.split(" ");
	String ReverseString=" ";
	
	for (String w:word) {
		
		String reverseWord="";
		
	for (int i=w.length()-1;i>=0;i--) {

		
		reverseWord=reverseWord + w.charAt(i);
	}	
	ReverseString =ReverseString +reverseWord + " ";
	}
	System.out.println(ReverseString); 
		
	//2nd Way
	/*	
		String str2="Selenuim And Java and API";
		String[] word=str2.split(" ");
		String ReverseString=" ";

		for (String w1:word) {
			
			StringBuilder sb=new StringBuilder(w1);
			sb.reverse();
			ReverseString =ReverseString +sb.toString()+" ";
		}
	System.out.println(ReverseString);
	
	
	//3rd Way
	/*	String str = "Welcome to Faceebook";
    
    // Splitting the string based on space and reverse each part
    // and then join
    String result = Arrays.asList(str.split(" "))
            .stream()
            .map(s -> new StringBuilder(s).reverse())
            .collect(Collectors.joining(" "));

    System.out.println(result);

*/
}}