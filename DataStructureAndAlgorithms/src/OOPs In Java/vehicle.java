

public abstract class vehicle {
	protected String color;
	private int maxSpeed;
	
	public vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("vehicle");
	}
	
	
	public int getmaxSpeed() {
		return maxSpeed;
	}
	public void setmaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public abstract String getCompany();
	
	public abstract boolean isMoterized();
	
	public void print() {
		System.out.println("color of vehicle : " + color);
		System.out.println("speed of vehicle : " + maxSpeed);		
	}
}
