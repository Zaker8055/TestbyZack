package Inheritence;

public class Child extends Parents {
	
	int a=21;
	int b=31;
	
public static void Parents1() {
		
		System.out.println("I m Child method");
	}

	public static void main(String[] args) {

		
		Parents p=new Child();
		p.Parents1();
		Parents1();
		
	
				
		
		
		
	}
	static {
		System.out.println("I m Static Block");
	}

}
