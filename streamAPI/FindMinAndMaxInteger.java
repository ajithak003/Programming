package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinAndMaxInteger {

	public static void main(String[] args) {
		  List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		  
		  int min = list.stream().min(Comparator.naturalOrder()).get();
		  int max = list.stream().max(Comparator.naturalOrder()).get();
		  
		  System.out.println("Min : "+min +"  : Max : "+max);

	}

}
