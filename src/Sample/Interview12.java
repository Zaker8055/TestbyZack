package Sample;

public class Interview12 {

	public static void main(String[] args) {

		int []n={-1,-2,0,-10,-20,1};
		
		int H=n[0];
		int SH=n[0];
		
		for (int i=1;i<n.length;i++) {
			
			if(n[i]>H) {
				
				SH=H;
			    H=n[i];
				
				
			}
			else if(n[i]>SH && H!=n[i]){
				
				SH=n[i];
						
			}
			
		}
		System.out.println(H);
		System.out.println(SH);
		
		
	}

}
