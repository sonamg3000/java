package objectdemo;

public class Test2 {
	
	 void show(String a,int b) //no of argument same
	{
		System.out.println("1");
	}
}
	class xyz extends Test2
	{
		void show (String a,int b)

		{
			System.out.println("2");
		}
	
		
	
	public static void main (String args[]) 
	
	{  
		Test2 t=new Test2();
		t.show("sonam", 100);
        xyz x=new xyz();
        x.show("dj", 54);
       
	}

}

