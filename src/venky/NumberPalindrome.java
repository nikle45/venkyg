package venky;

public class NumberPalindrome {
	
	public static boolean isPalindrome(int num) {
		int reverse =0;
		
		if (num <0) { num =num*-1; }
		int n=num;
		while (n>0) {
			int rm = n%10;
			reverse = reverse+ rm ;
			reverse = reverse*10;
			n = n/10;
		}
		
		reverse=reverse/10;
		
		if (num == reverse) {return true;}
		else { return false;}

		
	}

}
