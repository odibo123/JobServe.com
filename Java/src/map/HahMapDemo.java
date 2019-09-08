package map;

import java.util.HashMap;

public class HahMapDemo {

	public static void main(String[] args) {

  HashMap <String, String> obj1=new HashMap<String, String> ();
  obj1.put("400", "chris");
  obj1.put("450", "ovie");       
  obj1.put("500", "selenium");
  obj1.put("600", "java");
  System.out.println( obj1);
  String value =obj1.get("400");

  System.out.println(value);  //chris
  
  String values =obj1.get("500");
  System.out.println(values);
	}
 
}


//does not follow order    {400=chris, 500=selenium, 600=java, 450=ovie}