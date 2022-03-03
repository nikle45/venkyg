package venky;

public class BarkingDog {

	public static boolean shouldWakeUP(boolean barking, int hourOfDay) {
		if (hourOfDay<0 || hourOfDay >= 24 ) {
			return false;
		}else if((hourOfDay < 8 || hourOfDay > 22) && barking ) {
			return true;
		}else {
			return false;
		}
	}
}
