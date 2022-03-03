package venky;

public class EvenDigitSum {

	public static int getEevenDigitSum(int num) {
		
		int sum =0;
		if (num<0) { return -1;}
		while(num>0) {
			int r= num%10;
			if (r%2==0) { sum =sum +r; }
			num = num/10;
			
		}
		System.out.println(sum);
		return sum;
	}
}
