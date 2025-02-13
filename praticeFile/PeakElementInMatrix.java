package praticeFile;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PeakElementInMatrix {

	public static void main(String[] args) {
		int[][] matrix = {  };

		 findPeakElement(matrix);
	}

	public static void findPeakElement(int[][] matrix) {
		
		try {
		
		int max = Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().orElseThrow(() -> new RuntimeException("Matrix is empty"));
        boolean flag = false;
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[i].length; j++) {
				if(max == matrix[i][j]) {
					System.out.println("Peak element coordinates: ("+i+" , "+j+")");
					flag = true;
					break;
				}
				if(flag) {
					break;
				}
					
			}
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		//		System.out.println("Peak element coordinates: (" + peakElement[0] + ", " + peakElement[1] + ")");

	}
}
