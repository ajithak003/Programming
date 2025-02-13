package searchingDSA;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {43,54,22,55,39,2,5,43,6,98};
		int target = 55;
		int resultIndex = linearSearch(arr,target);

		if(resultIndex >=0) {
			System.out.println("Index of the target element : "+resultIndex);
		}else {
			System.out.println("The target element was not present in this Array");
		}
	}

	
	public static int linearSearch(int[]arr,int target) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target)
				return i;
		}
		
		
		return -1;
	}
	
}
