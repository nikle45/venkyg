package firstclass;

public  class Mitsubishi extends Car {

	public int a;
	public Mitsubishi(int a,int cylinder, String name ) {
		super(cylinder,name);
		this.a=a;
	}

	
	
	public String startEngine() {
		
		return getClass().getSimpleName()+ " -> startEngine";
	}
	public String accelerate() {
		return getClass().getSimpleName()+ " -> accelerate";
	}
	public String brake() {
		return getClass().getSimpleName()+ " -> brake";
	}
}