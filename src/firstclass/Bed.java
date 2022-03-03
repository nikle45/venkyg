package firstclass;

public class Bed {

	private  String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;
	private Bed(String style, int pillows, int height, int sheets, int quilt) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	public Bed() {
		 this("ABC",2,3,5,6);
	}

	
	public  void make() {
		System.out.println("Bed -> Making | ");
	}
	public String getStyle() {
		return style;
	}
	public int getPillows() {
		return pillows;
	}
	public int getHeight() {
		
		return height;
	}
	public int getSheets() {
		return sheets;
	}
	public int getQuilt() {
		return quilt;
	}
	
	public static void main(String[] args) {
		Bed b=new Bed();
		System.out.println(b.getStyle());
		
	}
}
