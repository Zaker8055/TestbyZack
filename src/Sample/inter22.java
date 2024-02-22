package Sample;

public class inter22 {

	public static void main(String[] args) {

		int a[]= {21,21,3,12,13,10,13,11,12,0,0};
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(" "+a[j]);
				}
			}
		}
	}

}
