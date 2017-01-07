package collection.com;

public class Student  implements Comparable<Student> {
	String name;
	int age;
		public Student(String name,int age) {
			this.name=name;
			this.age=age;
		}
		 
		@Override
		public int compareTo(Student o) {
			 if(this.age==o.age)
				 return 0;
			 else if(this.age> o.age)
				 return 1;
			 else
				 return -1;
		}

}
