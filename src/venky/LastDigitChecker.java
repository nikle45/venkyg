package venky;

public class LastDigitChecker {

	public static boolean hasSameLastDigit(int a, int b, int c) {
		if ((a>=10) && (a<=1000) && (b>=10) &&(b<=1000) && (c>=10) && (c<=1000)) {
			a=a%10;
			b=b%10;
			c=c%10;
			if ((a==b) || (b==c)|| (a==c)) { return true;}
		} return false;
	}
	
	public static boolean isValid(int a) {
		if (a>=10 && a<=1000 ) {
			return true;
		}
		return false;
	}
}
