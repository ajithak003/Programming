package sortingDSA;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
	
		int[] arr = {3,5,2,6,4,1};
		
		 mergeSort(arr,0,arr.length-1);

	}

	private static void mergeSort(int[] arr, int l, int r) {
		
		if(l<r) {
			
			int mid = (l+r)/2;
			
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			
			merge(arr,l,r,mid);
		}
	}
	
	private static void merge(int[]arr,int le, int r, int mid) {
		
		int n1 = mid - le + 1;
		int n2 = r - mid;
		
		int[] lArr = new int[n1];
		int[] rArr = new int[n2];
		
		for(int i=0; i<n1; i++) {
			lArr[i] = arr[le+i];
		}
		for(int i=0; i<n2; i++) {
			rArr[i] = arr[mid+i+1];
		}
		
		int i = 0;
		int j = 0;
		int k = le;
		
		
		while(i<n1 && j<n2) {
			
			if(lArr[i] < rArr[j]) {
				arr[k] = lArr[i];
				i++;
			}else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
			
			while(i<n1) {
				arr[k] = lArr[i];
				i++;
				k++;
			}
			
			while(j<n2) {
				arr[k] = rArr[j];
				j++;
				k++;
			}
		}
		
		
		 System.out.println("result of this array : "+Arrays.toString(arr));
		
	}

}
