package Sample;

public class QA {

		    public static void main(String[] args) {
		        String input = "sannask";
		        int startIndex = 1;
		        int endIndex = 4;

		        String substring = input.substring(startIndex, endIndex + 1);

		        if (isPalindrome(substring)) {
		            System.out.println(substring + " is a palindrome.");
		        } else {
		            System.out.println(substring + " is not a palindrome.");
		        }
		    }

		    public static boolean isPalindrome(String str) {
		        int left = 0;
		        int right = str.length() - 1;

		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }

		        return true;
		    }
		}
