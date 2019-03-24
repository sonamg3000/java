class Animal 
{
        public void eat()
		{
		
			System.out.println("I am eating");
		}
	       public static void main (String[] args) 
	       {
	    	    System.out.println("1");
	    	    Animal aa =new Animal();
	    	    aa.eat();
	    	    aa.run();
	    	    Birds bb = new Birds();
	    	    bb.fly();
	       }
	        public void run()
	       {
	    	   System.out.println("i am running");
	       
	       class Birds
	       {
	    	  public void fly()
	    	   {
	    		   System.out.println("i am Flying");
	    	   } 
	       }
	
}

















































