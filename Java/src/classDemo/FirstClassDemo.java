package classDemo;

public class FirstClassDemo {

	//non static...to access a non static variable or methods create a staic method and objects
	int x=90;
	int y=100;
	public static void main(String[] args) {
		System.out.println("program started");
		FirstClassDemo obj1 = new FirstClassDemo();
		obj1.sum();
		System.out.println("End program");
		//call x and y
		System.out.println("x value is "+ obj1.x);
		
		System.out.println("y value is "+ obj1.y);
		
	//	FirstClassDemo obj2 = new FirstClassDemo();	
	}

	public void sum(){
	
		int a = 90;
		int b = 100;
		int c= b+a;
		System.out.println("Sum of two numbbers is " +c);
	}
	
}
