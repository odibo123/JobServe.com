package interfaceDemo;

public class AdvanceCal2 implements Calc{

	public static void main(String[] args) {
		
		Calc obj1 = new  AdvanceCal2();
		obj1.add();
		obj1 .sub();
	}
	

	
	public void calculateCos()
	
	{
	System.out.println("I am in Advance Cal Cos method");	
	}
	
public void calculateSin()
	
	{
	System.out.println("I am in Advance Cal sin method");	
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
