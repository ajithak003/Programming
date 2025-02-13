package praticeFile.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClassFunctions {

	public static void main(String[] args) {
		
		ArrayClassFunctions obj = new ArrayClassFunctions();
        obj.copyOfArray();

	}
	
	private void copyOfArray() {
		int[] number1 = {1,2,3};
		int[] number2 = {4,5,6};
		
		// using system.arraycopy
		int[] arraycopy1 = new int[number1.length + number2.length];
		System.arraycopy(number1, 0, arraycopy1, 0, number1.length);
		System.out.println("arraycopy1 : "+Arrays.toString(arraycopy1));
		System.arraycopy(number2, 0, arraycopy1, number1.length, number2.length);
		System.out.println("arraycopy1 : "+Arrays.toString(arraycopy1));
		//using arraycopy and system
		int[] arraycopy2 = Arrays.copyOf(number1, number1.length+number2.length);
		System.out.println("arraycopy2 : "+Arrays.toString(arraycopy2));
		System.arraycopy(number2, 0, arraycopy2, number1.length, number2.length);
		System.out.println("arraycopy2 : "+Arrays.toString(arraycopy2));
		
	}

}
