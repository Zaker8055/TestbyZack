package StringPrograms;

public class Swap2Values {

	public static void main(String[] args) {

		int x=90;
		int y=800;
		
		x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping"); 
        System.out.println("X Value is " +x);
        System.out.println("Y Value is " +y);
        
        //Using Temp Swaping 2 Values
         
        int a=33 ,b=44 ,temp;
        temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping with Temp"); 
        System.out.println("A Value is " +a);
        System.out.println("B Value is " +b);
	}

}
