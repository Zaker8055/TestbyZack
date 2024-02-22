
package StringPrograms;
public class IncrementDigits {
	
    public static String incrementDigits(String input) {
    	
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            
        	char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                // If the character is a digit, increment it
                result.append((char)(ch + 1));
            }
            
            else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        String input = "abc123xyz789";
        String output = incrementDigits(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}