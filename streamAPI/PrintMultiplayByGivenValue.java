package streamAPI;

import java.util.Arrays;
import java.util.List;

public class PrintMultiplayByGivenValue {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(43,35,43,6,3,55,343,5,3,7654,32,4,86966);
		
		int num = 2;
		
		list.stream().filter(i->i%num == 0).forEach(System.out::println);
		
	}

}
