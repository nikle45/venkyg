package venky;

public class SumOddRange {
	public static boolean isOdd(int num) {
		if (num<0) { return false;}
		if(num%2==0) { return false; }
		else { return true;}
	}
public static int sumOdd(int start, int end) {
	
	int sum =0;
	if (start <0 || end <0) { return -1;}
	if (!(end>=start)) {return -1;}
	for (int i=start ;i<=end ;i++) {
		if (isOdd(i)) { sum +=i;}
	}
	return sum;
}

}
