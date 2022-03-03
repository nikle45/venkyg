package firstclass;

public class Bedroom {

	private String name;
	private Wallco wall1;
	private Wallco wall2;
	private Wallco wall3;
	private Wallco wall4;
	private Ceiling ceiling;
	private Bed bed;
	private Lamp lamp;
	public Bedroom(String name, Wallco wall1, Wallco wall2, Wallco wall3, Wallco wall4, Ceiling ceiling, Bed bed,
			Lamp lamp) {
		
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}
	
	public Lamp getLamp() {
		return lamp;
	}
	public  void makeBed() {
		System.out.println("Bedroom -> Making bed | ");
		bed.make();
	}
	
}
