package StringPrograms;

public class Count_number_of_vowels_in_a_String {
	
	public static void main(String[] args) {
        
//========1st Way 		
	/*	String str1 = "Hello980K547, World!";
        
        System.out.println("Original string: " + str1);
        System.out.println("Number of vowels: " + str1.replaceAll("(?i)[^aeiou]", "").length());
    
    */
//========2nd Way 
	
        String str = "Geeioes";
        str = str.toLowerCase();
        int count = 0;
 
       for (int i = 0; i < str.length(); i++)
        
       {// check if char[i] is vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                {
                // count increments if there is vowel in
                // char[i]
                count++;
                 }
        }
 
        // display total count of vowels in string
        System.out.println("Total no of vowels in string are: " + count);
    }
}
