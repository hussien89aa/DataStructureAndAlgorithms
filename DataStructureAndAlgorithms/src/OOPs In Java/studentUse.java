

public class studentUse {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		
		
		s1.name = "Ajay";
		s1.rollNo = 15;
		//s1.age = 23;   note allowed
		s1.setAge(12);   // returns 0;
 		s1.setAge(23);
		
		
		s2.name = "sachin";
		s2.rollNo = 131;
		 // s2.age = 21;   not allowed
		s2.setAge(21);
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		//System.out.println(s1.age);    // not allowed
		System.out.println(s1.getAge());
		
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		//System.out.println(s2.age);   // not allowed
		System.out.println(s2.getAge());
		
		
		
		// constructor use
		
		student s3 = new student("nayan", 190,21);
		
		System.out.println(s3.name);
		System.out.println(s3.rollNo);
		System.out.println(s3.getAge());
		
		System.out.println(s1.getNumStudent() + " " + s2.getNumStudent() + " " + s3.getNumStudent() + " " + student.getNumStudent());    // all have same value;
		
		
	}

}
