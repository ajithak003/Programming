package searchingDSA;

public class BinarySearch {

	static int steps = 0;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		int target = 8;
		int resultIndex = binarySearch(arr, target, 0, arr.length-1);

		if (resultIndex >= 0) {
			System.out.println("Target index : " + resultIndex);

		} else {
			System.out.println("The target element was not present in this array");
		}
		System.out.println("steps : " + steps);
	}

	public static int binarySearch(int[] arr, int target, int start, int end) {
		steps++;
		if (end>=start) {
			int mid = start+(end-start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				return binarySearch(arr, target, start, mid-1);
			} else{
				return binarySearch(arr, target, mid+1, end);
			}
		}
		return -1;

	}

}
