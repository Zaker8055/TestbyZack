package Sample;

public class ProgramVirtusa {

	public static void main(String[] args) {

		String input="java array collection";
		
		String[] inp=input.split(" ");
		
		String RevString="";
		
		for (String word:inp) {
			
			String Rw="";
			
			if(word=="array") {
			for (int i=word.length()-1;i>=0;i--) {
				
				Rw=Rw+word.charAt(i);
			}
			}
			else {
			
			RevString=RevString+Rw+" ";
			}
		}
		
		System.out.println(RevString);
			
		}
	

}
