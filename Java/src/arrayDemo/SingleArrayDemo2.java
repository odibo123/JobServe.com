package arrayDemo;

import org.omg.Messaging.SyncScopeHelper;

public class SingleArrayDemo2 {

	public static void main(String[] args) {
		int student_id[] = new int[5];
//limitation of array use cast has to type cast
		
		student_id [0]=(int) 10.9;
		student_id [1]=90;
		student_id [2]=80;
		student_id [3]=70;
		student_id [4]=60;
		int sizeofArray= student_id.length;
		System.out.println("length of array "+sizeofArray);  //5
		for(int i=0; i<sizeofArray; i++){
			System.out.println("Student id is" +student_id[i]);
		}
		
		//do the same for string as in int
	/*	String student_name[] = new String[5];
		student_name[4] = "peter"
	}*/

}
}