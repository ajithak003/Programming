package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindThreeMinAndMaxValues {

	public static void main(String[] args) {

        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int limit = 3;
        System.out.println("Minimum Elements : ");
        list.stream().sorted().limit(limit).forEach(System.out::println);
        System.out.println("Maximum Elements : ");
        list.stream().sorted(Comparator.reverseOrder()).limit(limit).forEach(System.out::println);
		
	}

}
