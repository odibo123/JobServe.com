package arrayDemo;

public class SingleArrayDemo1 {

	public static void main(String[] args) {
//	int a = 100;
// int  b = 90;
//	int c = 80;
		int student_id[] = new int[5];
		student_id [0]=100;
		student_id [1]=90;
		student_id [2]=80;
		student_id [3]=70;
		student_id [4]=60;
				System.out.println("student id " +student_id [0]);//100
				System.out.println("student id " +student_id [1]);//90
				System.out.println("student id " +student_id [4]);//60
				
				//limitation of array.array is fixed
		System.out.println("student id " +student_id [5]);//.ArrayIndexOutOfBoundsExceptio
				
				


	}

}
