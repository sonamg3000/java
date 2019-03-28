package objectdemo;

public class student3 {    //constructor parameterize
	int id;
	String name;
	student3(int i,String n){   //creting parater const
		id =i;
		name = n;
	}
	void Display()                   //method display
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		student3 s1=new student3(122,"sonam");      //object create
		student3 s2=new student3(142,"mona");
         s1.Display();                                 //methoy calling
         s2.Display();
	}

}
