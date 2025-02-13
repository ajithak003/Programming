package aidetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AideticMainClass {

	public static void main(String[] args) {
		
		List<Integer> list2 = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 6, 8, 10);
		
		List<Integer> temp = new ArrayList<>();
		
		
			
			
			
		
		
	
		// 

		List<Integer> list3 = new ArrayList<>();
		//List<Integer> temp ;

		
	//List<Integer> result = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
	
	//System.out.println("Result : "+result);
		//int length ;
		int j = 0;
		
		
		if(list1.size()>list2.size()) {
			
			
			 for(int i =0; i<list2.size(); i++) {
					
					while(list1.get(j)<list2.get(i)) {
						list3.add(list1.get(j));
						j++;
					}
					
					list3.add(list2.get(i));
					
					if(list2.size()-1 == i) {
						while(j<list1.size()) {
							list3.add(list1.get(j));
							j++;
						}
					}
					
				}   
			
			
		}else {
          for(int i =0; i<list1.size(); i++) {
				
				while(list2.get(j)<list1.get(i)) {
					list3.add(list2.get(j));
					j++;
				}
				
				list3.add(list1.get(i));
				
				if(list1.size()-1 == i) {
					while(j<list2.size()) {
						list3.add(list2.get(j));
						j++;
					}
				}
				
			}   

		}
		
		
		
		
		
		System.out.println("Result : "+list3);
	}

}
