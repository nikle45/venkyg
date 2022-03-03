package firstclass;

public class Car  {

	private boolean engine;
	private int cylinder;
	private String name;
	private int wheels;
	
	public Car( int cylinder, String name ) {
		this.cylinder=cylinder;
		this.name=name;
		this.engine=true;
		this.wheels=4;
	}
	
	public int getCylinder() {
		return cylinder;
	}

	public String getName() {
		return name;
	}

	public String startEngine() {
		return getClass().getSimpleName() +" -> startEngine";
	}
	public String accelerate() {
		return getClass().getSimpleName() + " -> accelerate";
	}
	public String brake() {
		return getClass().getSimpleName() + " -> brake";
	}
}
