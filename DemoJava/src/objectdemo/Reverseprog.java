package objectdemo;

public class Reverseprog {

	public static void main(String[] args) {
		String fname ="ssoossnnaamm";
		int StringLength=fname.length();
		   String j = " ";
		   
		  for(int i=(StringLength-1);i>=0;i--)
		  {
			  j= j+fname.charAt(i);
		  }
		 System.out.println("Reverse String " +j);  
		

	}

}
