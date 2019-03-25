package objectdemo;

public class student2
{
	int id;
	String name;
	
	void insert(int r,String n)                  //using Method object
	{
	id = r;
	name = n;
	}
    void Display()
{
	System.out.println(id+" "+name);
}
}
 class TestStudent3
 {
	 public static void main(String[] args) {
		student2 s1=new student2();       
		student2 s2=new student2();
		s1.insert(111, "Sonam");
       s2.insert(123,"dhawal");
       s1.Display();
       s2.Display();
	}

}
