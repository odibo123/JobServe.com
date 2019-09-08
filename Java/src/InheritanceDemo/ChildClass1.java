package InheritanceDemo;

public class ChildClass1 extends  BaseClass {

	public static void main(String[] args) {
		
		ChildClass1 obj1= new ChildClass1();
		obj1.add();
		obj1.sub();
		obj1.div();
		obj1.mul();
	}
//BaseClass obj1 = new BaseClass(); can only access parent or baseclass methods

	public void mul()
	{
		
		System.out.println("Hey I am in base class and addition is 2500");
	}

	public void div()
	{
		
		System.out.println("Hey I am in base class and addition is 50");
	}
}//child class referwence and child class object
//Hey I am in base class and addition is 250
//Hey I am in base class and subtraction is 150//
//Hey I am in base class and addition is 50
//Hey I am in base class and addition is 2500
