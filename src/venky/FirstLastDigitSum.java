package venky;

public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int num) {
		if (num <0) { return -1;}
		int f = num %10;
		int n=0;
		while (num>0) {
			n=num;
			num =num/10;
			
		}
		return n+f;
		
	}

}
