package InheritanceDemo;

public class ChildClass3 extends  BaseClass{

	public static void main(String[] args) {
		//refernce matters as it points to parent.can only access parent methods
		BaseClass obj2= new ChildClass3();
		obj2.add();
		obj2.sub();
		//Hey I am in base class and addition is 250
		//Hey I am in base class and subtraction is 150
	}


	public void mul()
	{
		
		System.out.println("Hey I am in base class and addition is 2500");
	}

	public void div()
	{
		
		System.out.println("Hey I am in base class and addition is 50");
	
	}

}
