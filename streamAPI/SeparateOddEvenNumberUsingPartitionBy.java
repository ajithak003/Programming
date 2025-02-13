package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddEvenNumberUsingPartitionBy {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
		//Partition By rreturn always Map with <Boolean, List<object>
		Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(i->i%2 == 0));
		
		System.out.println("Odd Number : "+result.get(false));
		System.out.println("Even Number : "+result.get(true));
		
	}

}
