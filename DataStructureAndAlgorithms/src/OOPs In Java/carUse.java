

public class carUse {

	public static void main(String[] args) {
		
		vehicle v = new BMW();
		v.color = "red";
		//v.maxSpeed = 180;
		v.setmaxSpeed(100);
//		System.out.println(v.color);
//		System.out.println(v.getmaxSpeed());
//		v.print();
		
		
		car c = new BMW();
//		c.print();
		
		c.color = "black";
		//c.maxSpeed = 180;
		c.setmaxSpeed(180);
		c.numGears = 5;
		c.isConvertible = true;
		
		System.out.println(c.color);
		//System.out.println(c.maxSpeed);
		System.out.println(c.getmaxSpeed());
		System.out.println(c.numGears);
		System.out.println(c.isConvertible);
		System.out.println(c.getCompany());
		
		c.print();
		
		vehicle v2 = new BMW();
		
		v2.color = "red";
		//v2.numGears; //error
		
		vehicle2 v3 = new car2();
		v3.setSpeed(9384757);
		System.out.println(v3.getSpeed());
	}

}
