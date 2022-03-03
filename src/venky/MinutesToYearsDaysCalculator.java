package venky;

public class MinutesToYearsDaysCalculator {

	public static void printYearAndDays(long minutes) {
		
		if (minutes>=0) {
		long h= minutes/60;
		long d = h/24;
		long y= d/365;
		long rmd=d%365;
		System.out.println(minutes+" min = "+y +" y and "+rmd+" d");}
		else {
			System.out.println("Invalid Value");
		}
		}
}
