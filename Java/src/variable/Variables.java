package variable;

public class Variables {

	
	int x = 45;
	 static String name = "Tom";
	public static void main(String[] args) {
		Variables j = new Variables();
		
		int y = 40;
		
		System.out.println(name);//Tom
		System.out.println("name");//name
		
		
		System.out.println("x");//x
		System.out.println("y");//y
		System.out.println("The value for instanceVariable x is  "+ 45);//The value for localVariable x is  45
		System.out.println("The value for globalVariable x is  " + Variables.name);
		

	}

}
