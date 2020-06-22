

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {2,3,4,20,30,40};
		System.out.println(Arrays.toString(array));
		reverse(array);
		System.out.println(Arrays.toString(array));
		// another way to do it.
		System.out.println("*****************************************************************");
		Object[] anotherArray = {10,20,30,2,3,4,6};
		System.out.println("Array before reverse: "+ Arrays.toString(anotherArray));
		List listOfMyArray = Arrays.asList(anotherArray);
		Collections.reverse(listOfMyArray);
		Object[] arrayReversed = listOfMyArray.toArray(anotherArray);
		System.out.println("Array after reverse: "+ Arrays.toString(arrayReversed));
		
	}
	
	// Reverse array is impure
	

	public static void reverse(int[] array) {
		
		for(int i = 0; i<array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
			
		}
		
	}
	
	
}
