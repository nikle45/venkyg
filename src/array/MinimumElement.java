package array;

import java.util.Scanner;

public class MinimumElement {

	public static void main(String arg[]) {
		
		int count = readInterger();
		int [] array = readElements(count);
		System.out.println("MIN " + findMin(array));
	}
	
	
	private static int readInterger() {
		Scanner scan =new Scanner(System.in);
		int count=scan.nextInt();
		return count;
	}
	
	private static int [] readElements(int count) {
		int [] array = new int[count];
		System.out.println("Enter the Elements ");
		Scanner scan =new Scanner(System.in);
		
		for (int i=0;i<count;i++) {
			array[i]=scan.nextInt();
			scan.nextLine();
		}
		return array;
	}
	private static int findMin(int [] array) {
		int min=Integer.MAX_VALUE;
		for (int i=0;i<array.length;i++) {
			int element =array[i];
			if (min>element) {
				min=element;
			}
		}
		return min;
	}
}
