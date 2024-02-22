package StringPrograms;

public class Program_for_the_Fibonacci_series {
	public static void main(String[] args) {
        int terms = 10; // Change this value to the number of terms you want in the series

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < terms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm; 
    }
       
    }
}
