package praticeFile;

public class PraticeClass {
	
	public void findArray(int arr[][], int element) {
		try {
	outer: for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(element == arr[i][j]) {
					System.out.println("element is matched : "+ arr[i][j]);
					break outer;
				}
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
	
	public static void main(String args[]) {
		
		PraticeClass obj = new PraticeClass();
		 int arr[][] = { { 32, 45, 35 }, { 53, 65, 67 }, { 43, 23, 76 } };
		 obj.findArray(arr,65);
	}
	
}


