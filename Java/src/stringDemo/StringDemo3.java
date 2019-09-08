package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String actuals = "Welcome to Selenium Webdriver world";
        String expected= "Welcome to Selenium";
        boolean status2=actuals.equalsIgnoreCase(expected);    //false
        System.out.println("Status is "+ status2);
	}

}
