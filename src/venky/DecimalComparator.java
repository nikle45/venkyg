package venky;



public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
		int f = (int) (a*1000);
		int s = (int) (b*1000);
		if (f==s) {
			return true;
		}else {return false; }
	}
}
