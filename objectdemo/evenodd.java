package objectdemo;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter a number: ");
		 int no = s.nextInt();
		
        if(no % 2 == 0)                   //ternary operator:String evenOdd = (num % 2 == 0) ? "even" : "odd";
            System.out.println(no + " is even");
        else
            System.out.println(no + " is odd");

	}

}
