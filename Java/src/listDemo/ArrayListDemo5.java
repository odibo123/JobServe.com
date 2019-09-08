package listDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("chris");
		obj1.add("ovie");
		obj1.add("christopher, pyh");
		System.out.println("value is "+obj1 );  //value is [chris, ovie, christopher, pyh]

		for(String v:obj1){
			
			System.out.println(v);
		}
	}

}
