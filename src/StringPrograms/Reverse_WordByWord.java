package StringPrograms;

public class Reverse_WordByWord {
	
	public static void main(String[] args) {

		String input="my name is zaker";  //zaker is name my;
		
		String [] inp=input.split(" ");
		
		StringBuilder result=new StringBuilder();
		
		
		for (int i=inp.length-1;i>=0;i--) {
			
			result.append(inp[i]);
			
			if(i!=0) {
				
				result.append(" ");
			}
		}
		
	
		System.out.print(result);
		
		
	}
}
