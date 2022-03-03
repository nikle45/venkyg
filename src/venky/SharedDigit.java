package venky;

public class SharedDigit {

	public static boolean hasSharedDigit(int a, int b) {
		int x=0,y=0;
		int c=0,p=0;
		if ((a>=10 && a <=99) && (b>=10 && b<=99))  { 
			x=a%10;
			while (a>0) {
				y=a;
				a=a/10;
			}
			c=b%10;
			while(b>0) {
				p=b;
				b=b/10;
			}
			
			if ((x==c) || (x==p) || (y==c) || (y==p)) { return true;}
			else { return false;}
		}
		else { return false;}
	}
}
