package objectdemo;

public class swap {

	public static void main(String[] args)
	{
		int a=12, b=32;
		System.out.println("before swap " );
        System.out.println("first no =" +a);
        System.out.println("second no ="+ b);
	
       a=a-b;
       b=a+b;
       a=b-a;
       System.out.println("After Swap");
       System.out.println("first no =" +a);
       System.out.println("second no =" +b);
       
}
}