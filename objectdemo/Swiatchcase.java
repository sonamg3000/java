package objectdemo;

import java.util.Scanner;

public class Swiatchcase {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("entered Two no:");
		double first=s.nextInt();
		double  second =s.nextInt();
		
		System.out.println("Enter an Operation:(+,-,*,/):");
		char operator = s.next().charAt(0);

        double result;
        switch (operator)
        {
        case'+':
        	result=first+second;
        	break;
        	
        case'-':
        	result=first-second;
        	break;
        	
        case'*':
        	result=first*second;
        	break;	
        	
        case'/':
        	result=first/second;
        	break;	
        	
        default:
            System.out.printf("Error! operator is not correct");
            return;
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        
        }
		

	}


