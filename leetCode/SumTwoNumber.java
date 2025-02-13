package leetCode;

import java.util.Arrays;

public class SumTwoNumber {

	public static void main(String[] args) {
		
		SumTwoNumber sum = new SumTwoNumber();
		int [] nums = {2,56,5,13,7,5,77};
		int []output = sum.twoSum(nums, 10);
		System.out.println("output : "+ Arrays.toString(output));

	}
public int[] twoSum(int[] nums, int target) {
        
        
        int [] output = new int[2];
        boolean flag = false;
        for(int i=0; i < nums.length; i++){
           
            for(int j=i+1; j< nums.length; j++){
                
                int total = nums[i]+nums[j];
                    if(target == total){
                    	output [0] = i;
                        output [1] = j;
                        flag = true;
                        break;
                    }
            } 
            if(flag) {
            	break;
            }
        }
        
        return output;
    }

}
