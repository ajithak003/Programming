package sortingDSA;

public class QuickSorting {

	public static void main(String[] args) {
		//int[] arr = { 3, 63, 223, 66, 99, 64, 33, 6, 2, 55, 1 };
		int[] arr = {3,5,2,6,4,1};
		System.out.println("size of array : "+arr.length);
		int[] resultArray = quickSort(arr,0,arr.length-1);
		System.out.println("result array");
		for (int num : resultArray) {
			System.out.print(num + " ");
		}

	}

	public static int[] quickSort(int[] arr, int low, int high) {
		
		if(low<high) {
			
			int pi = findPivot(arr,low,high);
			
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
			
		}
		
		return arr;
	}

	private static int findPivot(int[] arr, int low, int high) {
		//int[] arr = {3,5,2,6,4,1};
		int pivot = arr[high];
		int i = low -1;
		
		for(int j=low; j<high; j++) {
			
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		System.out.println("for loop itration : " + i);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		return i+1;
	}

}
