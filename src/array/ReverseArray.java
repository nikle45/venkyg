package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String arg[]) {
	
		int [] a=getArray();
		for (int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		int [] b= reverse(a);
		for (int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
	}
	
	public static int [] getArray() {
		int count ;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		count = scan.nextInt();
		int [] array = new int [count];
		System.out.println("Enter the  elements in array");
		for (int i=0;i<count;i++) {
			array[i]=scan.nextInt();
			scan.nextLine();
		}
		return array;
	}
	
	public static int [] reverse(int [] array) {
		
		int [] reverse =new int [array.length];
		
		for (int i= 0;i<array.length;i++) {
			reverse[(array.length-1)-i]=array[i];
			}
		
		return reverse;
	}
}
