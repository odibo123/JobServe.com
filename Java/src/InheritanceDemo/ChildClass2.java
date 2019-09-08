package InheritanceDemo;

public class ChildClass2 extends  BaseClass{

	public static void main(String[] args) {
	

		
		BaseClass obj1= new BaseClass();
		obj1.add();
		obj1.sub();
		
	}
//BaseClass obj1 = new BaseClass(); can only access parent or baseclass methods

	public void mul()
	{
		
		System.out.println("Hey I am in base class********** and addition is 2500");
	}

	public void div()
	{
		
		System.out.println("Hey I am in base class and addition is 50");
	}
	//Hey I am in base class and addition is 250
	//Hey I am in base class and subtraction is 150

	}


