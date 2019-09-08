package exceptionHandling;

import java.util.InputMismatchException;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Start");
		
	//	int c= 10/2;
	//	System.out.println("the answer is "+c);	
		try{
		
		int d= 10/0;
		System.out.println("the answer is "+d);
		
		
		}
		catch(ArithmeticException e )     
		
		{  
		System.out.println("Something went wrong please check the exception"+ e.getMessage());
		System.out.println("seems you have entered zero please provide value >0");
	    }
		
         catch(InputMismatchException e )
		
		{  
		
		System.out.println("Enter integer value");
	    }
		
		
		  catch(Exception e )  //parent class exception must be first otherwise deadcode or unreachable code..code bever get executed
		
				{  
				
				System.out.println("oops something went wrong");
			    }
		finally{
			System.out.println("Finnaly end");
			
		}
		
		System.out.println("End");
		
		/*Start
		Something went wrong please check the exception/ by zero
		seems you have entered zero please provide value >0
		End*/
	}
}
