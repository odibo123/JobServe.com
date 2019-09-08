package compileTimePolymorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		
		CompileDemo1 obj1 = new CompileDemo1();
		obj1 .add(9, 8);
		obj1.add(97, 98, 76);
		obj1.add(876.87, 87.8);
		obj1.add(65, 87.98);
		obj1.add(78.5, 9);
		//number  of argument,types of argument and order of arguments= signature
	}
  
	
	public void add(int a, int b){
		
	int c= a+b;
		System.out.println("sum of number "+c);
	}
	
	public void add(int a, int b, int c){
		
		int d= a+b -c;
		System.out.println("sum of number "+d);
	}
	public void add(double a, double b){
		
		double c= a+b;
		System.out.println("sum of number "+c);
	}
	//upcasting or int and double  double is a higher datatype same as float
public void add(int a, double b){
		
	double sum= a+b;
		System.out.println("sum of number "+sum);
	}
//change order of argument
public void add( double b, int a){
	
	double sum= a+b;
		System.out.println("sum of number "+sum);
	}
}
