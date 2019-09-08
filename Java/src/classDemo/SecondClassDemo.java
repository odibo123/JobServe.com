package classDemo;

public class SecondClassDemo {

	public static void main(String[] args) {
		//can call their methods   and call non static methods
		Calculator obj1 = new Calculator();
		obj1.sum();
		obj1 .substraction();
		
		System.out.println("Name is "+ obj1.name);
		
		System.out.println("Hobby is "+ obj1.hobby);	
		
	}

}
