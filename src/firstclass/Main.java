package firstclass;

public class Main {

	public static void main(String arg[] ) {
		SimpleCalculator s=new SimpleCalculator();
		s.setFirstNumber(5.0);
		s.setSecondNumber(4);
		System.out.println("add= "+s.getAdditionResult());
		System.out.println("sub= "+s.getSubtractionResult());
		s.setFirstNumber(5.25);
		s.setSecondNumber(0);
		System.out.println("mul= "+s.getMultiplicationResult());
		System.out.println("divi= "+s.getDivisonResult());
	}
}
