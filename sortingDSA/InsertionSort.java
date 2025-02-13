package sortingDSA;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 66, 223, 63, 99, 64, 33, 463, 6, 2, 55, 1 };
		// int[] arr = {3,3,3,3,1};
		// int[] arr = {33,6,99};

		System.out.println("size of array : " + arr.length);
		int[] resultArray = inserionSort(arr);
		System.out.println("result array");
		for (int num : resultArray) {
			System.out.print(num + " ");
		}

	}

	public static int[] inserionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {

				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

			System.out.println("for loop itration : " + i);
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();

		}

		return arr;
	}

}
