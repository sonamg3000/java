package inheritancedemo;

import java.util.Scanner;

public class Employdemo extends persondemo
{
    String e;
    double s;
    String d;
    
    public void input1()
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Employee Details");
		e=sc.next();
    	s=sc.nextDouble();
		d=sc.next();
    }
    
     public void showEmpdetais()
     {
    	 System.out.println("Employee Id:"+e);
    	 System.out.println("Saiary:"+s);
         System.out.println("Designtion:" + d);
     }
	     public static void main(String[] args)
	     {
	    	
	    	Employdemo e1= new Employdemo();
	    	/*e1.empId="001";
	    	e1.designation="tester";
	    	e1.sal =3000;
	    	e1.name="sonam";
	    	e1.age =40;
	    	e1.gender="female";
	    	e1.showpersonDetails();
	    	e1.showEmpdetais();*/
	    	
	    	e1.input();
	        e1.showpersonoutput();
	    	e1.input1();
	    	e1.showEmpdetais();
	        
	     }
}

	    	
	    			
	     
	
		
	


