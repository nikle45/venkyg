package venky;

public class PerfectNumber {

	public static boolean isPerfectNumber(int a) {
		int sum =0;
		if (a<1) {return false;}
		for (int i=1; i<a;i++) {
			if (a%i==0) {
				sum =sum+i;
			}
		}
		
		System.out.println(sum);
		if (a==sum) {
			return true;
		}
		else { return false;} 
	}
}
