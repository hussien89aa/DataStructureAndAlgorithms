

public class student {
	public String name;
	public int rollNo;
	private int age;
	private static int numStudent;    // static member is same for all objects;
	
	public student() {        // default constructor
		numStudent++;
	}
	public student(String name, int rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		numStudent++;
	}
	
	public void setAge(int age) {
		if(age<16)             // this is the actual use of set function
			return;            //that control of setting data is in your hand     
		
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public static int getNumStudent() {
		return numStudent;
	}
}
