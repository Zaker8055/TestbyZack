package StringPrograms;

public class LargestNumberWithoutIfElse {

	public static void main(String[] args) {

		//this program efficiently finds and prints the largest number among +
		//the given integers a and b using the ternary operator to make the code concise and readable.
		
		int a=100;
		int b=20;
		
		int larg=a>b?a:b;
		
		System.out.println("largest Number is " +larg);
	}

}
