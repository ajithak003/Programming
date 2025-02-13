package sortingDSA;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 3, 63, 223, 66, 99, 64, 33, 6, 2, 55, 1 };
		// int[] arr = {3,3,3,3,1};
		int[] resultArray = bubbleSort(arr);
		System.out.println("result array");
		for (int num : resultArray) {
			System.out.print(num + " ");
		}

	}

	public static int[] bubbleSort(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {

			for (int j = 1; j < size - i; j++) {

				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

			System.out.println("for loop itration : " + i);
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		return arr;
	}

}
