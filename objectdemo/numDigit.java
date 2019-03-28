package objectdemo;

public class numDigit {

	public static void main(String[] args)
	 {

	        int count = 0, no = 56745647;

	        while(no != 0)
	        {
	           
	            no /= 10;                                  // no = no/10
	            ++count;
	        }

	        System.out.println("Number of digits: " + count);
	    }
	
		

	}


