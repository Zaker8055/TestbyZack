package StringPrograms;

public class Reverse_an_integer {
	
	/* Iterative function to reverse
    digits of num*/
	public static void main (String[] args)
    {
		int num = 888800999;
        int rev_num = 0;
        System.out.println(num);
        
        while(num!=0)
        {
           rev_num = rev_num * 10 + num % 10;
        	
            num = num / 10;
        }
        System.out.println(rev_num);
        System.out.println(num);

    }

    
}
