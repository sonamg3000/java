package inheritancedemo;

import java.util.Scanner;

public class persondemo
{
      String a;
      int b;
      String c;
      public void input()
      {
    	
  		Scanner sc= new Scanner(System.in); 
  		System.out.println("Enter person Details");
  		
  		 a=sc.next();
  		 b=sc.nextInt();
  		 c=sc.next();
  		
  		
      }
          public void showpersonoutput()
      {
    	  System.out.println("name:" + a);
          System.out.println("age:" + b);
          System.out.println("gender:" + c);
      }   
      
	public static void main(String[] args)
	{
      persondemo p1 = new persondemo();
      
      p1.input();
      p1.showpersonoutput();
       
      

	}

}
