package parameterDemo;

public class ParameterDemo2 {

	
	
	public static void main(String[] args) {
	 ParameterDemo2 obj1= new  ParameterDemo2();
		int sum= obj1.add(453, 98);
		System.out.println("Sum result is "+sum);  //551
		
		 double sub=obj1.sub(65.87, 76.8);
		 System.out.println("double result is "+sub);
}

	
	
	public int add(int a, int b) 
	{
		int c =a+b;
		return c;	
	}
	
	public double sub(double  a, double  b) 
	{
		double c =a-b;
		return c;	
	}
	
}