package objectdemo;

public class CompareString {

	public static void main(String[] args)
	{
		String style = "Bold";             //String style=new String("bold");
        String style2 = "Bold";            //String style= new String("bold");

        if(style == style2)                 //if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
	}

}
