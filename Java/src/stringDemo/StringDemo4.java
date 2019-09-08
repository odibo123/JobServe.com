package stringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		//wrong...gave error
		
		String fullname = "Selenium-HP-QTP-Grid";
		
		String []toolname =  fullname.split("-");
		
		for(int i=0;i<toolname.length;i++);
		{
			//System.out.println("value for " + toolname[1]);
			//System.out.println( toolname[2]);//QTP
			System.out.println( toolname[3]);//Grid
			System.out.println( toolname[4]);  //java.lang.ArrayIndexOutOfBoundsException:
			if(toolname[0].equalsIgnoreCase("Selenium")){
				
				
				System.out.println("Test passed");
				//break;
			}
		}
	}

}
