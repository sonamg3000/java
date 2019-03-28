package inheritancedemo;

import java.util.Scanner;

public class EmpinputDemo extends persondemo
{
	    String empId;
	    double sal;
	    String designation;
		
		
		public void output()
		{
			
	     System.out.println("you output is :"+empId+" & " +sal+"&"  +designation);
		}
	      public static void main(String[] args)
	{
		EmpinputDemo e1= new EmpinputDemo();
		e1.input();
		e1.output();
	}

}
