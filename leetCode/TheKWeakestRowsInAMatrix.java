package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class TheKWeakestRowsInAMatrix {

	public static void main(String[] args) {

		
		
		int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
		int k = 3;

		int[] result = TheKWeakestRowsInAMatrix.kWeakestRows(mat, k);
		System.out.println(Arrays.toString(result));
	}

	
	 public static int[] kWeakestRows(int[][] mat, int k) {
	        
	        
	        HashMap<Integer,Integer> weakestSoldiers = new HashMap<>(); 
	        int m = mat.length;
	     for(int i = 0 ; i < m; i++){
	    	 int noOfSoldiers = 0;
	         for(int j = 0; j<mat[i].length; j++){
	             if(mat[i][j] == 1) noOfSoldiers++;
	             else break;
	         }
             weakestSoldiers.put(i, noOfSoldiers);
	     }

	     List<Integer> list = new ArrayList<>(weakestSoldiers.keySet());
	     System.out.println(list);
	     
	     Collections.sort(list, (a, b) -> weakestSoldiers.get(a).compareTo(weakestSoldiers.get(b)));
	     System.out.println(list);

	     int[] resultArray = new int[k];

	    if(k > 0){
	     for(int i= 0 ;i<k; i++){
	       resultArray[i] = list.get(i);
	     }
	        
	    }
	    return resultArray;
	    }
	    
}
