package venky;

import java.util.Scanner;

public class InputCalculator {

	public static void inputThenPrintSumAndAverage() {
		Scanner s = new Scanner(System.in);
		int sum=0;
		double  avg=0;
		int count=1;
		boolean b;
		 while(true) {
			 int a = s.nextInt();
			 b=s.hasNextInt(a);
			 
			 if (b) {
				 sum = sum+a;
				 ++count;
				 
			 }else { break;}
			 
		 }
		 
		 avg = (Math.round((double)(sum/count)));
		 
		 
		System.out.println("SUM = "+ sum + " AVG = "+avg + " "+ count);
	s.close();	
	}
}
