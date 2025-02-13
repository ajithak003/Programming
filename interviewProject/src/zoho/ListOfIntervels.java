package zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntervels {

	public static void main(String[] args) {
		
		List<List<Integer>> input = new ArrayList<>();
		/*
		 * input.add(Arrays.asList(1,5)); input.add(Arrays.asList(2,4));
		 * input.add(Arrays.asList(5,7)); input.add(Arrays.asList(8,10));
		 * input.add(Arrays.asList(11,14));
		 */
		
		input.add(Arrays.asList(2,6));
		input.add(Arrays.asList(3,8));
		input.add(Arrays.asList(9,11));
		
		LinkedList<Integer> flattedMap = input.stream().flatMap(List::stream).
				collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println(flattedMap);
		
		int findinterval = flattedMap.get(0);
		List<List<Integer>> resultMap = new ArrayList<>();
		int index = 1;
		for(int i =1; i<flattedMap.size(); i++) {
			
			if(flattedMap.get(index) < flattedMap.get(i+1) ) {
				
				resultMap.add(Arrays.asList(findinterval,flattedMap.get(i+1)));
				i++;
				if(i<flattedMap.size()-1) {
					index=1;
					index+=i;
					findinterval = flattedMap.get(index);
				}
			}
			
		}
		System.out.println("Result : "+resultMap);
		
		
		
		

	}

}
