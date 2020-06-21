

import java.util.Arrays;
import java.util.Scanner;




//@RestController
public class SortArray {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hello world");
		int[] array = {2,3,4,20,30,40};

		reverse(array);
		int[] myIntegers = getIntegers(3);
		int[] mySortedArray = sortIntegers(myIntegers);
		printArray(mySortedArray);
	}
//	 SortArray with arrays;
	

	
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}
	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter "+ capacity + "integer values:\r");
		for(int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
			
		}
			
			return array;
		}
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = Arrays.copyOf(array, array.length);
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i=0; i<sortedArray.length-1; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
					
				}
			}
		}
		return sortedArray;
	}

	// Reverse Array:
	
	
	

	public static void reverse(int[] array) {
		
		int temp;
		for(int i = 0; i<array.length/2; i++) {
			temp = array[i];
			array[i] = array[array.length-1];
			array[array.length-1] = temp;
			
		}
	}
	
	
	

}
