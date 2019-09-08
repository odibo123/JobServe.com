package listDemo;

import java.util.ArrayList;

public class ArrayLIstDemo {

	public static void main(String[] args) {
		 

		ArrayList obj1= new ArrayList();
		obj1.add(5647);
		obj1.add('M');
		obj1.add("selenium");
		obj1.add(23.65);
		System.out.println(obj1);  //[5647, M, selenium, 23.65]

		System.out.println(obj1.get(3));//23.65
		
		int mySizeList = obj1.size();
		for(int i = 0; i<obj1.size(); i++){
			
	System.out.println("values from ArrayList is "+obj1.get(i));
		}
}
	
}