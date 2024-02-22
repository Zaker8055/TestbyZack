package StringPrograms;

public class ReverserString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Zaker";
		String s1="engineer";
		String rev="";
		
		for (int i=s.length()-1;i>=0;i--) {
			
			rev=rev + s.charAt(i);
			
		}
		System.out.println(rev);
		
		//By Using String Buffer and Inbuilt methood
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.reverse());

	}

}
