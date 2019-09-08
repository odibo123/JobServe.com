package parameterDemo;

public class DynamicCalculator2 {

	
		//static will call only static method here has 1 static and 2 non static methods
		
		
		public static String getFullName(String first, String lastname){
			
			String fullname= first+lastname;
			
			return fullname;
			
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

	//}


