package interviewProject;

import java.util.ArrayList;

public class FindArrayIndexSumOfTwoNumbers {

	public static void main(String[] args) {
		
		int num = 12;
		int[] arr = {2,5,9,2,5,8,4,6,8,3,9,4,6,7,9};
		findArrayIndex(num,arr);

	}
	
	public static void findArrayIndex(int num, int[] arr) {
		System.out.print("Sum of array index equal to "+num);
		System.out.println();
		ArrayList<String> resultArray = new ArrayList<>();
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if((arr[i]+arr[j]) == num) {
				//	System.out.println(i+"("+arr[i]+") : "+j+"("+arr[j]+")");
					resultArray.add(i+"("+arr[i]+") : "+j+"("+arr[j]+")");
				}
			}
		}
		
		System.out.println("Result Array : ");
		//resultArray.stream().forEach(str -> System.out.println(str));
		resultArray.stream().forEach(System.out::println);

		
	}

}
