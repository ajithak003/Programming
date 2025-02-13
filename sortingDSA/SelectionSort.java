package sortingDSA;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 63, 223, 66, 99, 64, 33, 6, 2, 55, 1 };
		//int[] arr = {3,3,3,3,1};
		System.out.println("size of array : "+arr.length);
		int[] resultArray = selectionSort(arr);
		System.out.println("result array");
		for (int num : resultArray) {
			System.out.print(num + " ");
		}

	}

	public static int[] selectionSort(int[] arr) {
		int size = arr.length;
		for(int i=0; i<size; i++) {
			int min = i;
			for(int j=i+1;j<size;j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
			System.out.println("for loop itration : " + i);
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		return arr;
	}

}
