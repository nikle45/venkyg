package firstclass;

public class ComplexNumber {

	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		this.imaginary=imaginary;
		this.real=real;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void add(double real, double imaginary ) {
		this.real=this.real+real;
		this.imaginary=this.imaginary+imaginary;
	}
	public void add(ComplexNumber c) {
		add(c.real,c.imaginary);
	}
	
	public void subtract(double real, double imaginary ) {
		this.real=this.real-real;
		this.imaginary=this.imaginary-imaginary;
	}
	public void subtract(ComplexNumber c) {
		subtract(c.real,c.imaginary);
	}
}
