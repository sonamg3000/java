package objectdemo;

public class gcd {

	public static void main(String[] args) 
	{
		
		        int n1 = 14, n2 = 48, gcd = 1;

		        for(int i = 1; i <= n1 && i <= n2; i++)
		        {
		           
		            if(n1 % i==0 && n2 % i==0)
		                gcd = i;
		        }

		        System.out.printf("gcd of  %d and %d is %d ", n1, n2, gcd);
		    }
		
		
	
	}
