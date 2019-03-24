package objectdemo;

public class Replaceprog {

	public static void main(String[] args)
	{
         String f="hgttryyuu";
         int lengString  = f.length();
         
     
         String j ="";
         for(int i=0; i<lengString; i++)
         {
        	if (f.charAt(i) == 't')
        	{
        		j=j+"@";
        	}
        	else {
        		j= j+f.charAt(i);
       
        	}
         }
        		 System.out.println("Replace String :"+ j);
        	 
         }
         
        
	}


	
	


