package venky;

public class GreatestCommonDivisor {
	
	public static int getGreatestCommonDivisor(int a, int b) {

		int g=0;
		if (a<10 || b< 10) {return -1;}
		
		for (int i=1; (i<=a)&&(i<=b); i++) {
			
			if((a%i==0)&&(b%i==0)) { g=i; }
		}
		return g;
	}

}
