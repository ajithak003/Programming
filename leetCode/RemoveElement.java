package leetCode;

public class RemoveElement {

	public static void main(String[] args) {
		
		RemoveElement removeElement = new RemoveElement();
		int nums [] = {0,1,2,2,3,0,4,2}; 
		System.out.println(removeElement.removeElement(nums, 2));

	}
	public int removeElement(int[] nums, int val) {
        
	      int originalSize = nums.length;
	      //int returnNums [] = new int [originalSize];
	      int count = 0;
	      for(int i=0; i < originalSize; i++){
	          if(nums[i] != val){
	              nums[count]=nums[i];
	              count++;
	      }
	          
	      }
	      return count ; 

	    }
}
