package objectdemo;

public class Test1 {
	         String color;
	         int  age;
	         void intobj(String c,int a)//using Method
	         {
	        	  color=c;
	        	  age=a;
	         }
	         void Display()
	         {
	        	 System.out.println(color+" "+age);
	        	 
	         }
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.intobj("black", 20);
		t.Display();
		
	}

}
