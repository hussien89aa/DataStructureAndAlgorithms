// inheritance : inherited form vehicle class



public abstract class car extends vehicle{
	int numGears;
	boolean isConvertible;
	
	public car() {
		super(100);
	}
	
	public car(int numGears,int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("car");
	}
	
	public boolean isMoterized() {
		return true;
	}
	
	
	public void print() {
		//System.out.println("speed of car : " + maxSpeed);
		super.print();
		System.out.println("num of Gears in car : " + numGears);
		System.out.println("car's convertible feature : " + isConvertible);
		
	}

}
