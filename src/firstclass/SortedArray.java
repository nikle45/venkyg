package firstclass;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

	Scanner scan=new Scanner(System.in);
	int [] array;
	
	public int[] getInterger(int Size) {
		for (int i=0;i<Size; i++) {
			array[i]=scan.nextInt();
		}
		return array;
	}
	
	public void printArray(int [] array) {
		for (int i=0; i<array.length;i++) {
			System.out.println("Element "+i+" contents "+array[i]);
		}
	}
	public int [] sortIntegers() {
		int [] sortedArray =Arrays.copyOf(array, array.length);
		boolean flag=true;
		int temp;
		while(flag) {
			flag=false;
			for (int i=0;i<array.length-1;i++) {
				if (sortedArray[i]< sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=temp;
					flag=true;
				}
			}
		}
		return sortedArray;
	}
}
