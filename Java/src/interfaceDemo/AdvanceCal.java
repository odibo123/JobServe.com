package interfaceDemo;

public class AdvanceCal implements Calc {

	public static void main(String[] args) {
		//same as in inheritance
		AdvanceCal obj1 = new AdvanceCal();
		obj1.add();
		obj1.sub();
		obj1.calculateCos();
		obj1.calculateSin();
	}

	//create his own method
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
