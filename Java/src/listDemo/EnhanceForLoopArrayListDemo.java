package listDemo;

import java.util.ArrayList;

public class EnhanceForLoopArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj1= new ArrayList();
		obj1.add(5647);
		obj1.add('M');
		obj1.add("selenium");
		obj1.add(23.65);
	
	
for (Object abc: obj1){
	System.out.println("values are "+abc );
}
	}

}
//values are 5647
//values are M
//values are selenium
//values are 23.65