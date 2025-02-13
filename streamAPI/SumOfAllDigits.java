package streamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {

	public static void main(String[] args) {
		
		int num = 64943;
		
		int result = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println("Result : "+result);

	}

}
