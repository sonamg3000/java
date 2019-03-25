package objectdemo;

import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter first no:");
		int no1=s.nextInt();
		System.out.println("entered second no:");
		int no2=s.nextInt();
		int sum= no1+no2;
		System.out.println("your sum is: "+sum);
				

	}

}
