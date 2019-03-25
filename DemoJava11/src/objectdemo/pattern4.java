package objectdemo;

public class pattern4 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++) 
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");  
			}
			        for(int k=1;k<=i;k++)        //(if j>i)
			  {
				System.out.print(k+" ");
		           
			}
			        System.out.println();
		}
		     
	}
}		







