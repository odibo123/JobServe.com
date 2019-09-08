package parameterDemo;

public class PassparameterDemo1 {

	public static void main(String[] args) {
		PassparameterDemo1 obj1 = new PassparameterDemo1();
		obj1.add(365, 609);//974
		obj1.sub(654, 765);  //111
		

	}

	
	public void add(int a, int b){
		
		int c =a+b;
		System.out.println("result is " +c);		
	}
	
public void sub(double x, double y){
		
	double result= y-x;
		System.out.println(" sub result is " +result);		
	}
	
}
