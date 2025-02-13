package streamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		
		int[] arr1 = {64,6,4,74,33};
		int[] arr2 = {98,33,232,65};
		
		int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();

		
		System.out.println("Result : "+Arrays.toString(result));
	}

}
