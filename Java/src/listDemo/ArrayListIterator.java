package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList obj1= new ArrayList();
		obj1.add(5647);
		obj1.add('M');
		obj1.add("selenium");
		obj1.add(23.65);
		
		
		
	Iterator itr=obj1.iterator();
while(itr.hasNext()){
	
	Object value= itr.next();
	System.out.println("values are "+value );
}
		
//values are 5647
//values are M
//values are selenium
//values are 23.65
	}

}
