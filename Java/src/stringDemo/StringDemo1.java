package stringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name= "Selenium Webdriver";
		boolean Status = name.startsWith("Selenium");
         System.out.println(" Status is "+ Status);
         
         
         String name2 ="Fill the earth";
         boolean Status2 = name2.endsWith("earth");
         System.out.println("Status is "+ Status2);
		
         String name3 ="Fill the earth";
         boolean Status3 = name3.startsWith("earth");
         System.out.println("Status is "+ Status3);
		
		
         
       String actuals = "Welcome to Selenium Webdriver world";
        String expected= "Welcome to Selenium";
        boolean status2=actuals.equalsIgnoreCase(expected);    //false
        System.out.println("Status is "+ status2);
         
		String actual = "Welcome to Selenium Webdriver world";
		String expected1= "Welcome to Selenium";
		 boolean status3=actual.contains("Welcome to");
		 System.out.println("Status is "+status2);
	}

}
