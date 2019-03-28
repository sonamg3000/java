package objectdemo;

public class student4 {
	
	int id;
	String name;
	int age;
	
	student4(int i,String n){   //creting parater const using two arg
		id =i;
		name = n;
	}
	
	student4(int i,String n,int a) {    //creating 3 argunment
	       id=i;
	       name =n;
	       age =a;
	}
	
		void Display()                   //method display
	{
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		student4 s1=new student4(122,"sonam");      //object create
		student4 s2=new student4(142,"mona",20);
         s1.Display();                                 //methoy calling
         s2.Display();
	}

}


