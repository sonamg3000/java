package objectdemo;

public class leepyear {

	public static void main(String[] args) 
	{
		int year=2018;
	   if((year%400==0)||(year%4==0 && year%100!=0))
	   {
		   System.out.println("leep year");
	   }
	   else
	   {
		   System.out.println("not a leep year");
	   }
	}

}
