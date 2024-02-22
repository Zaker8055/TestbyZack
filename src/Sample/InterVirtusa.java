package Sample;

public class InterVirtusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input: Bubble Butter
		//Output: $ubble $$utter
		
		String input="Bubble Butter";
		
		StringBuilder result=new StringBuilder();
		int count=0;
		
		
		for (int i=0;i<input.length();i++) {
			
			char ch=input.charAt(i);
			
			
			if(ch=='B') {
				
				count=count++;
				
				result.append((char) ('$'));
			
				
				
			}
			else{
				result.append(ch);
				
			}
		}
		System.out.println(result);
	}

}
